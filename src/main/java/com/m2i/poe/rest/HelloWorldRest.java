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
    @Path("/param/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(@PathParam("s") String s) {
        return "Hello "+s;
    }

    @GET
    @Path("/mock/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getMock(@PathParam("id") int id) {
        Book b = new Book();
        b.setTitle("JSON");
        b.setId(id);
        b.setPrice(99);
        return b;
    }

    @GET
    @Path("/book/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(@PathParam("id") int id) {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class,id);
        return b;
    }
}