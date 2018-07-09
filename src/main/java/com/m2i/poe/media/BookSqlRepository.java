package com.m2i.poe.media;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookSqlRepository implements IBookRepository {

    private Connection connection;

    @Override
    public void load(String uri) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(uri,"postgres","admin");
    }

    @Override
    public List<Book> getAll() throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from book");
        List<Book> res = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book b = new Book(id,title,price);
            res.add(b);
        }
        return res;
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
