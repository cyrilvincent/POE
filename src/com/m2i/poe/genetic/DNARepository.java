package com.m2i.poe.genetic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DNARepository {

    private DNA dna;

    public void load(String uri) throws IOException, GeneticException {
        BufferedReader reader = new BufferedReader(new FileReader("dna.txt"));
        String s = reader.readLine();
        dna = new DNA(s);
    }

    public DNA getDNA() {
        return dna;
    }

    public static void generateRandomDNAFile(String uri, int size) throws IOException {
        String[] tab = {"A", "T", "C", "G"};
        BufferedWriter writer = new BufferedWriter(new FileWriter(uri));
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        for(int i = 0;i<10000;i++) {
            writer.write(tab[r.nextInt(4)]);
        }
        writer.close();
    }
}
