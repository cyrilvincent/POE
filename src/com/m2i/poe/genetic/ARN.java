package com.m2i.poe.genetic;

import java.util.ArrayList;

public class ARN {

    private ArrayList<Base> strand = new ArrayList<>();

    public ARN() {
    }

    public String toString() {
        String res = "";
        for(Base b : strand) {
            res += b.getSymbol();
        }
        return res;
    }


    public ArrayList<Base> getStrand() {
        return strand;
    }

    public ArrayList<AminoAcid> translate() {
        ArrayList<AminoAcid> protein = new ArrayList<>();
        for(int i = 0;i<strand.size();i+=3) {
            Base base1 = strand.get(i);
            Base base2 = null;
            Base base3 = null;
            if(i+1 < strand.size()) {
                base2 = strand.get(i+1);
            }
            if(i+2 < strand.size()) {
                base3 = strand.get(i+2);
            }
            if(base3 != null) {
                AminoAcid aa = translate(base1, base2, base3);
                protein.add(aa);
            }
        }
        return protein;
    }

    public AminoAcid translate(Base base1, Base base2, Base base3) {
        AminoAcid aa = null;
        if(base1.getSymbol().equals("C")) {
            if(base2.getSymbol().equals(("U"))) {
                aa = new AminoAcid("L");
            }
            else if(base2.getSymbol().equals(("G"))) {
                aa = new AminoAcid("R");
            }
        }
        else if(base1.getSymbol().equals("U")) {
            if(base2.getSymbol().equals(("C"))) {
                aa = new AminoAcid("S");
            }
        }
        else {
            //TODO
        }
        return aa;
    }
}
