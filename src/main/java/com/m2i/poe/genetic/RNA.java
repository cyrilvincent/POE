package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RNA extends Nucleotide {

    public RNA() {}

    public RNA(String code) throws GeneticException {
        super(code);
        if(code.contains("T")) {
            throw new GeneticException("U is forbiden in DNA");
        }
    }

    @Override
    public String toString() {
        return "RNA: "+super.toString();
    }
}
