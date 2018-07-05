package com.m2i.poe.genetic;

public class Base {

    private String symbol;
    private String name;
    private String familly;

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getFamilly() {
        return familly;
    }

    public Base(String symbol) throws GeneticException {
        this.symbol = symbol;
        if(symbol.equals("A")) {
            name = "Adenine";
            familly = "Purine";
        }
        else if(symbol.equals("T")) {
            name = "Thymine";
            familly = "Pyrimidine";
        }
        else if(symbol.equals("C")) {
            name = "Cytosine";
            familly = "Pyrimidine";
        }
        else if(symbol.equals("G")) {
            name = "Guanine";
            familly = "Purine";
        }
        else if(symbol.equals("U")) {
            name = "Uracine";
            familly = "Pyrimidine";
        }
        else {
            throw new GeneticException("Unknow base "+symbol);
        }

    }

    public Base getApparie(boolean isArn) {
        Base b = null;
        try {
            if (symbol.equals("A")) {
                if (isArn) {
                    b = new Base("U");
                } else {
                    b = new Base("T");
                }
            } else if (symbol.equals("T")) {
                b = new Base("A");
            } else if (symbol.equals("C")) {
                b = new Base("G");
            } else if (symbol.equals("G")) {
                b = new Base("C");
            } else if (symbol.equals("U")) {
                b = new Base("A");
            }
        }
        catch (GeneticException ex) {}
        return b;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
