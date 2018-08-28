package com.m2i.poe.rest;

import com.m2i.poe.media.Book;
import com.m2i.poe.media.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.ws.rs.core.*;

import javax.ws.rs.*;

@Path("/hello")
public class HelloWorldRest {

    @GET
    @Path("/world")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("/mock")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getMock() {
        Book b = new Book();
        b.setTitle("JSON");
        b.setId(12);
        b.setPrice(99);
        return b;
    }

    @GET
    @Path("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook() {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class,1);
        return b;
    }
}