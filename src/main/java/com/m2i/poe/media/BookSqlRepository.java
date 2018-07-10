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

    private List<Book> getBySql(String sql) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
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
    public List<Book> getAll() throws SQLException {
        return getBySql("select * from book");
    }

    @Override
    public Book getById(int id) throws SQLException {
        List<Book> l = getBySql("select * from book where id ="+id);
        return l.get(0);
    }

    @Override
    public List<Book> getByTitle(String title) throws SQLException {
        return getBySql("select * from book where title ilike '%"+title+"%'");
    }

    @Override
    public List<Book> getByPrice(double price) throws SQLException {
        return getBySql("select * from book where price <= "+price);
    }

    @Override
    public List<Book> getByPublisher(String publisherName) throws SQLException {
        return getBySql("select * from book, publisher where book.publisherid = publisher.id and publisher.name ilike '%"+publisherName+"%'");
    }

    @Override
    public void add(Book b) throws SQLException {
        String sql ="insert into book (title, price) values ('"+b.getTitle()+"',"+b.getPrice()+")";
        Statement st = connection.createStatement();
        st.execute(sql);
    }

    @Override
    public void remove(Book b) throws SQLException {
        Statement st = connection.createStatement();
        st.execute("delete from book where id="+b.getId());
    }

    @Override
    public void update(Book b) throws SQLException {
        String sql ="update book set title = '"+b.getTitle()+"', price ="+b.getPrice()+" where id="+b.getId();
        Statement st = connection.createStatement();
        st.execute(sql);
    }
}
