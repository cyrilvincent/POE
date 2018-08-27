package com.m2i.poe.rest;

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
}