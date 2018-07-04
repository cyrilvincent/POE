package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.List;

public class Protein {

    private List<AminoAcid> peptide = new ArrayList<>();

    public List<AminoAcid> getPeptide() {
        return peptide;
    }

    public void setPeptide(List<AminoAcid> peptide) {
        this.peptide = peptide;
    }

    public List<Protein> factory(List<AminoAcid> peptide) {
        List<Protein> res = new ArrayList<>();
        Protein p = new Protein();
        for(AminoAcid aa : peptide) {
            if(aa.getName().equals("STOP")) {
                res.add(p);
                p = new Protein();
            }
            else {
                p.getPeptide().add(aa);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String s = "";
        for(AminoAcid aa : peptide) {
            s+=aa.getSymbol();
        }
        return s;
    }
}
