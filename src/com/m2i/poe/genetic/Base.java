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

    public Base(String symbol) {
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
            System.err.println("Base error "+symbol);
        }

    }

    public Base getApparie(boolean isArn) {
        if(symbol.equals("A")) {
            if(isArn) {
                return new Base("U");
            }
            else {
                return new Base("T");
            }
        }
        else if(symbol.equals("T")) {
            return new Base("A");
        }
        else if(symbol.equals("C")) {
            return new Base("G");
        }
        else if(symbol.equals("G")) {
            return new Base("C");
        }
        else if(symbol.equals("U")) {
            return new Base("A");
        }
        else {
            return null;
        }
    }

    public String toString() {
        return symbol;
    }
}
