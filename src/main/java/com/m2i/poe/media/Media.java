package com.m2i.poe.media;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Media implements IMedia {

    private double price;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String title;

    @Transient
    private Publisher publisher;

    @Transient
    private List<Author> authorList = new ArrayList<>();

    public Media() {}

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public List<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Media "+id+": "+title+" "+getNetPrice()+"€";
    }
}
