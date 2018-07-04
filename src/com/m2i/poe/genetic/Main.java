package com.m2i.poe.genetic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] tab = {"A", "T", "C", "G"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("dna.txt"));
            Random r = new Random();
            r.setSeed(System.currentTimeMillis());
            for(int i = 0;i<10000;i++) {
                writer.write(tab[r.nextInt(4)]);
            }
            writer.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }



        Base a = new Base("A");
        System.out.println(a);
        System.out.println(a.getApparie(false));
        DNA dna1 = new DNA("ATCG");
        System.out.println(dna1);
        System.out.println(dna1.getComplementary());
        RNA arn = dna1.transcription();
        System.out.println(arn);
        DNA dna2 = new DNA("GAAAGAGCG");
        arn = dna2.transcription(); // CUUUCUCGC
        System.out.println(arn);
        ArrayList<AminoAcid> protein = arn.translate(); // LSR
        System.out.println(protein);
    }
}
