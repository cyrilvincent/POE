package com.m2i.poe.genetic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Base a = new Base("A");
        System.out.println(a);
        System.out.println(a.getApparie(false));
        DNA dna1 = new DNA("ATCG");
        System.out.println(dna1);
        System.out.println(dna1.getComplementary());
        ARN arn = dna1.transcription();
        System.out.println(arn);
        DNA dna2 = new DNA("GAAAGAGCG");
        arn = dna2.transcription(); // CUUUCUCGC
        System.out.println(arn);
        ArrayList<AminoAcid> protein = arn.translate(); // LSR
        System.out.println(protein);
    }
}
