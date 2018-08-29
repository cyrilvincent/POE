package com.m2i.poe.media;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book extends Media {

    @Transient
    private int nbPage;

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public Book() {}

    public Book(int id, String title, double price) {
        super(id,title,price);
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.05 * 0.95 + 0.01;
    }
}
