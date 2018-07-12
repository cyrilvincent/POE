package com.m2i.poe.media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {

    void load(String uri) throws IOException, ClassNotFoundException, SQLException;

    List<Book> getAll() throws SQLException;
    Book getById(int id) throws SQLException;
    List<Book> getByTitle(String title) throws SQLException;
    List<Book> getByPrice(double price) throws SQLException;
    List<Book> getByPublisher(String publisherName) throws SQLException; // Bonus
    // Bonus
    void add(Book b) throws SQLException;
    void remove(Book b) throws SQLException;
    void update(Book b) throws SQLException;

}
