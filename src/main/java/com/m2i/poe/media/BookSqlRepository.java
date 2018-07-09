package com.m2i.poe.media;

import java.io.IOException;
import java.util.List;

public class BookSqlRepository implements IBookRepository {
    @Override
    public void load(String uri) throws IOException {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> getByPrice(double price) {
        return null;
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        return null;
    }

    @Override
    public void add(Book b) {

    }

    @Override
    public void remove(Book b) {

    }

    @Override
    public void update(Book b) {

    }
}
