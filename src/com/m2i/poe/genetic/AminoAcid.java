package com.m2i.poe.genetic;

public class AminoAcid {

    private String symbol;
    private String trigram;
    private String name;

    public AminoAcid(String symbol) {
        this.symbol = symbol;
        if(symbol.equals("R")) {
            trigram = "Arg";
            name = "Arginine";
        }
        else if(symbol.equals("S")) {
            trigram = "Ser";
            name = "Serine";
        }
        else if(symbol.equals("L")) {
            trigram = "Leu";
            name = "Leucine";
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTrigram() {
        return trigram;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return symbol;
    }
}
