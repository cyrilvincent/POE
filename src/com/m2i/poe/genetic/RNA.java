package com.m2i.poe.genetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RNA {

    private ArrayList<Base> strand = new ArrayList<>();
    private Map<String, String> codonMap = new HashMap<>();
    public RNA() {
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," ");
        codonMap.put("UAG"," ");
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," ");
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");
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
        String codon = base1.getSymbol()+base2.getSymbol()+base3.getSymbol();
        AminoAcid aa = new AminoAcid(codonMap.get(codon));
        return aa;
    }
}
