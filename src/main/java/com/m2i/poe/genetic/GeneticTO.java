package com.m2i.poe.genetic;

import java.io.Serializable;
import java.util.List;

public class GeneticTO implements Serializable {

    private String dna;
    private String rna;
    private List<String> proteinList;

    public GeneticTO() {}

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public String getRna() {
        return rna;
    }

    public void setRna(String rna) {
        this.rna = rna;
    }

    public List<String> getProteinList() {
        return proteinList;
    }

    public void setProteinList(List<String> proteinList) {
        this.proteinList = proteinList;
    }
}
