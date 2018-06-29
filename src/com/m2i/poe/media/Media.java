package com.m2i.poe.media;

import java.util.ArrayList;

public class Media {

    private double price;
    private int id;
    private String title;
    private Publisher publisher;
    private ArrayList<Author> authorList = new ArrayList<>();

    public Media() {}

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getNetPrice() {
        return price * 1.2;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
}
