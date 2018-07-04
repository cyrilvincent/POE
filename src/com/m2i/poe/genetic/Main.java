package com.m2i.poe.genetic;

import java.io.*;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        String[] tab = {"A", "T", "C", "G"};
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("dna.txt"));
//            Random r = new Random();
//            r.setSeed(System.currentTimeMillis());
//            for(int i = 0;i<10000;i++) {
//                writer.write(tab[r.nextInt(4)]);
//            }
//            writer.close();
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }



        Base a = new Base("A");
        System.out.println(a);
        System.out.println(a.getApparie(false));
        DNA dna = new DNA("ATCG");
        System.out.println(dna);
        System.out.println(dna.getComplementary());
        RNA rna = dna.transcription();
        System.out.println(rna);
        DNA dna2 = new DNA("GAAAGAGCG");
        rna = dna2.transcription(); // CUUUCUCGC
        System.out.println(rna);
        List<AminoAcid> peptide = rna.translate(); // LSR
        Protein protein = new Protein();
        protein.setPeptide(peptide);
        System.out.println(protein);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("dna.txt"));
            String s = reader.readLine();
            dna = new DNA(s);
            System.out.println(dna);
            rna = dna.transcription();
            System.out.println(rna);
            peptide = rna.translate();
            protein.setPeptide(peptide);
            System.out.println(protein);
            List<Protein> genome = protein.factory(peptide);
            System.out.println(genome.size());
            System.out.println(genome);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
