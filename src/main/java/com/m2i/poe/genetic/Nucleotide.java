package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.List;

public abstract class Nucleotide {

    private List<Base> strand = new ArrayList<>();

    public Nucleotide() {}

    public Nucleotide(String code) throws GeneticException {
        for(char c : code.toCharArray()) {
            Base b = new Base(String.valueOf(c));
            getStrand().add(b);
        }
    }

    public List<Base> getStrand() {
        return strand;
    }

    @Override
    public String toString() {
        String res = "";
        for(Base b : getStrand()) {
            res += b.getSymbol();
        }
        return res;
    }
}
