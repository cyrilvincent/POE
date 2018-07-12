package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.List;

public class Protein {

    private List<AminoAcid> chain = new ArrayList<>();

    public List<AminoAcid> getChain() {
        return chain;
    }

    public Protein() {}

    public Protein(List<AminoAcid> chain) {
        this.chain = chain;
    }

    public void setChain(List<AminoAcid> chain) {
        this.chain = chain;
    }

    public boolean isProtein() {
        return chain.size() > 50;
    }

    @Override
    public String toString() {
        String s = "Peptide: ";
        if(isProtein()) {
            s = "Protein: ";
        }
        for(AminoAcid aa : chain) {
            s+=aa.getSymbol();
        }
        return s;
    }
}
