package com.m2i.poe.genetic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            //DNARepository.generateRandomDNAFile("dna.txt", 10000);
            Base a = new Base("A");
            System.out.println(a);
            System.out.println(a.getApparie(false));
            DNA dna = new DNA("ATCG");
            System.out.println(dna);
            System.out.println(dna.getComplementary());
            RNA rna = dna.transcription();
            System.out.println(rna);
            dna = new DNA("GAAAGAGCG");
            rna = dna.transcription(); // CUUUCUCGC
            System.out.println(rna);
            Ribosome ribosome = new Ribosome();
            Protein protein = ribosome.translate(rna).get(0); // LSR
            System.out.println(protein);


            DNARepository repo = new DNARepository();
            repo.load("dna.txt");
            dna = repo.getDNA();
            System.out.println(dna);
            rna = dna.transcription();
            System.out.println(rna);
            List<Protein> proteinList = ribosome.translate(rna);
            System.out.println(proteinList);
            for (Protein p : proteinList) {
                if (p.isProtein()) {
                    System.out.print("Protein: ");
                } else {
                    System.out.print("Peptide: ");
                }
                for (AminoAcid aa : p.getChain()) {
                    System.out.print(aa.getTrigram() + "-");
                }
                System.out.println();
            }
            System.out.println("Total: " + proteinList.size());
        }
        catch (GeneticException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
