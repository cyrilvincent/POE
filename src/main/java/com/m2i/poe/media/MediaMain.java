package com.m2i.poe.media;

import java.io.IOException;
import java.sql.SQLException;

public class MediaMain {

    public static void main(String[] args) {
        IMedia m2 = new Book(0,"",0);
        IMedia b = new Book(1,"Java",10);
        IMedia m = new Cd(2,"A que Johnny",20);
        m = new Dvd(3, "Rambo 12", 30);
        System.out.println(m.getNetPrice());
        m.setPublisher(new Publisher(4,"Gaumont"));
        m.getAuthorList().add(new Author(5,"Silvester","Stallone"));
        int zone = ((Dvd) m).getZone();
        try {
            Cart cart = new Cart();
            cart.add(b);
            cart.add(b);
            cart.add(m);
            cart.remove(m);
        } catch (MediaException e) {
            e.printStackTrace();
        }
        BookRepository repo = new BookRepository();
        try {
            repo.load("books.csv");
            System.out.println(repo.getAll());
            System.out.println(repo.getByPrice(11));
            System.out.println(repo.getByTitle("py"));
            System.out.println(repo.getById(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BookSqlRepository repoSql = new BookSqlRepository();
        try {
            repoSql.load("jdbc:postgresql://localhost:5432/postgres");
            System.out.println(repoSql.getAll());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
