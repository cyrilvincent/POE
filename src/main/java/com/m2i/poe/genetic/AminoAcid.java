package com.m2i.poe.genetic;

public class AminoAcid {

    private String symbol;
    private String trigram;
    private String name;

    public AminoAcid(String symbol) throws GeneticException {
        this.symbol = symbol;
        if(symbol.equals("R")) {
            trigram = "Arg";
            name = "Arginin";
        }
        else if(symbol.equals("S")) {
            trigram = "Ser";
            name = "Serin";
        }
        else if(symbol.equals("L")) {
            trigram = "Leu";
            name = "Leucin";
        }
        else if(symbol.equals("F")) {
            trigram = "Phe";
            name = "Phenylalanin";
        }
        else if(symbol.equals("I")) {
            trigram = "Ile";
            name = "Isoleucin";
        }
        else if(symbol.equals("M")) {
            trigram = "Met";
            name = "Methionin";
        }
        else if(symbol.equals("V")) {
            trigram = "Val";
            name = "Valin";
        }
        else if(symbol.equals("P")) {
            trigram = "Pro";
            name = "Prolin";
        }
        else if(symbol.equals("T")) {
            trigram = "Thr";
            name = "Threonin";
        }
        else if(symbol.equals("A")) {
            trigram = "Ala";
            name = "Alanin";
        }
        else if(symbol.equals("Y")) {
            trigram = "Tyr";
            name = "Tyrosin";
        }
        else if(symbol.equals(" ")) {
            trigram = "STP";
            name = "STOP";
        }
        else if(symbol.equals("H")) {
            trigram = "His";
            name = "Histidin";
        }
        else if(symbol.equals("Q")) {
            trigram = "Gln";
            name = "Glutanin";
        }
        else if(symbol.equals("N")) {
            trigram = "Asn";
            name = "Asparagin";
        }
        else if(symbol.equals("K")) {
            trigram = "Lys";
            name = "Lysin";
        }
        else if(symbol.equals("D")) {
            trigram = "Asp";
            name = "AsparticAcid";
        }
        else if(symbol.equals("E")) {
            trigram = "Glu";
            name = "Glutamat";
        }
        else if(symbol.equals("C")) {
            trigram = "Cys";
            name = "Cystein";
        }
        else if(symbol.equals("W")) {
            trigram = "Trp";
            name = "Tryptophan";
        }
        else if(symbol.equals("R")) {
            trigram = "Arg";
            name = "Arginine";
        }
        else if(symbol.equals("G")) {
            trigram = "Gly";
            name = "Glycine";
        }
        else {
            throw new GeneticException("Unknow AminoAcid "+symbol);
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

    @Override
    public String toString() {
        return symbol;
    }
}
