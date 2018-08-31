package com.m2i.poe.rest;

import com.m2i.poe.genetic.*;
import com.m2i.poe.media.BookJPARepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Path("/")
public class GeneticRest {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Genetic";
    }

    @GET
    @Path("/dna/rna/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getRNA(@PathParam("s")String s) throws GeneticException {
        DNA dna = new DNA(s);
        RNA rna = dna.transcription();
        return rna.toRawString();
    }

    @GET
    @Path("/dna/protein/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getProtein(@PathParam("s")String s) throws GeneticException {
        DNA dna = new DNA(s);
        RNA rna = dna.transcription();
        Ribosome ribosome = new Ribosome();
        Protein protein = ribosome.translate(rna).get(0);
        return protein.toRawString();
    }

    @GET
    @Path("/dna/proteins/{s}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getProteins(@PathParam("s")String s) throws GeneticException {
        DNA dna = new DNA(s);
        RNA rna = dna.transcription();
        Ribosome ribosome = new Ribosome();
        List<Protein> proteinList = ribosome.translate(rna);
        List<String> stringList = proteinList.stream().map(p -> p.toRawString()).collect(Collectors.toList());
        return stringList;
    }

    @GET
    @Path("/dna/json/{s}")
    @Produces(MediaType.APPLICATION_JSON)
    public GeneticTO getJSON(@PathParam("s")String s) throws GeneticException {
        DNA dna = new DNA(s);
        RNA rna = dna.transcription();
        Ribosome ribosome = new Ribosome();
        List<Protein> proteinList = ribosome.translate(rna);
        List<String> stringList = proteinList.stream().map(p -> p.toRawString()).collect(Collectors.toList());
        GeneticTO to = new GeneticTO();
        to.setDna(s);
        to.setRna(rna.toRawString());
        to.setProteinList(stringList);
        return to;
    }

    @POST
    @Path("/dna/proteins")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> postProteins(String s) throws GeneticException {
        DNA dna = new DNA(s);
        RNA rna = dna.transcription();
        Ribosome ribosome = new Ribosome();
        List<Protein> proteinList = ribosome.translate(rna);
        List<String> stringList = proteinList.stream().map(p -> p.toRawString()).collect(Collectors.toList());
        return stringList;
    }


}