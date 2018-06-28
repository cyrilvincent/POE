package com.m2i.poe.genetic;

import java.util.ArrayList;

public class DNA {

    private ArrayList<Base> strand = new ArrayList<>();

    public DNA() {
    }

    public DNA(String code) {
        for(char c : code.toCharArray()) {
            Base b = new Base(String.valueOf(c));
            if(c == 'U') {
                System.out.println("U is forbidden in DNA");
            }
            strand.add(b);
        }
    }

    public String toString() {
        String res = "";
        for(Base b : strand) {
            res += b.getSymbol();
        }
        return res;
    }

    public ArrayList<Base> getComplementary() {
        ArrayList<Base> res = new ArrayList<>();
        for(Base b : strand) {
            res.add(b.getApparie(false));
        }
        return res;
    }

    public ARN transcription() {
        ARN arn = new ARN();
        for(Base b : strand) {
            arn.getStrand().add(b.getApparie(true));
        }
        return arn;
    }
}
