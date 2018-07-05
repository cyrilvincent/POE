package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.List;

public class DNA extends Nucleotide {

    public DNA() {
    }

    public DNA(String code) throws GeneticException {
        super(code);
        if(code.contains("U")) {
            throw new GeneticException("U is forbiden in DNA");
        }
    }

    public String toString() {
        return "DNA: "+super.toString();
    }

    public List<Base> getComplementary() {
        ArrayList<Base> res = new ArrayList<>();
        for(Base b : getStrand()) {
            res.add(b.getApparie(false));
        }
        return res;
    }

    public RNA transcription() { // By RNA Polymerase
        RNA arn = new RNA();
        for(Base b : getStrand()) {
            arn.getStrand().add(b.getApparie(true));
        }
        return arn;
    }
}
