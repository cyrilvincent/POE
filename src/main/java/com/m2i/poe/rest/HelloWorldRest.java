package com.m2i.poe.rest;

import com.m2i.poe.media.Book;

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
    @Path("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook() {
        Book b = new Book();
        b.setTitle("JSON");
        b.setId(12);
        b.setPrice(99);
        return b;
    }
}