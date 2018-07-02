package com.m2i.poe.media;

public class Cd extends  Media {

    private int nbPage;

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public Cd() {}

    public Cd(int id, String title, double price) {
        super(id,title,price);
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.2;
    }
}
