package com.m2i.poe.media;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class BookJPARepository implements IBookRepository {

    private EntityManager em = EntityManagerFactorySingleton.getEntityManager();

    @Override
    public void load(String uri) throws IOException, ClassNotFoundException, SQLException {
    }

    @Override
    public List<Book> getAll() throws SQLException {
        return em.createQuery("select b from Book b").getResultList();
    }

    @Override
    public Book getById(int id) throws SQLException {
        return em.find(Book.class, id);
    }

    @Override
    public List<Book> getByTitle(String title) throws SQLException {
        return em.createQuery("select b from Book b where upper(b.title) like '%"+ title.toUpperCase() + "%'").getResultList();
    }

    @Override
    public List<Book> getByPrice(double price) throws SQLException {
        return em.createQuery("select b from Book b where b.price <= "+ price).getResultList();
    }

    @Override
    public List<Book> getByPublisher(String publisherName) throws SQLException {
        return null;
    }

    @Override
    public void add(Book b) throws SQLException {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(b);
        t.commit();
    }

    @Override
    public void remove(Book b) throws SQLException {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(b);
        t.commit();
    }

    @Override
    public void update(Book b) throws SQLException {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(em.merge(b));
        t.commit();
    }
}
