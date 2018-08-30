package com.m2i.poe.rest;

import com.m2i.poe.media.Book;
import com.m2i.poe.media.BookJPARepository;
import com.m2i.poe.media.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.core.*;

import javax.ws.rs.*;
import java.sql.SQLException;
import java.util.List;

@Path("/hello")
public class HelloWorldRest {

    private BookJPARepository repo = new BookJPARepository();

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
    public Book getBook(@PathParam("id") int id) throws SQLException {
        return repo.getById(id);
    }

    @GET
    @Path("/book/price/{price}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBook(@PathParam("price") double price) throws SQLException {
        return repo.getByPrice(price);
    }

    @GET
    @Path("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBook() throws SQLException {
        return repo.getAll();
    }

    @GET
    @Path("/book/title/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBook(@PathParam("title") String title) throws SQLException {
        return repo.getByTitle(title);
    }

    @PUT
    @Path("/book")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book putBook(Book b) throws SQLException {
        repo.add(b);
        return b;
    }

    @POST
    @Path("/book")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postBook(Book b) throws SQLException {
        Book book = repo.getById(b.getId());
        if (book == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        repo.update(b);
        return Response.ok().build();
    }

    @DELETE
    @Path("/book/{id}")
    public Response deleteBook(@PathParam("id") int id) throws SQLException {
        Book book = repo.getById(id);
        if (book == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        repo.remove(book);
        return Response.ok().build();
    }
}