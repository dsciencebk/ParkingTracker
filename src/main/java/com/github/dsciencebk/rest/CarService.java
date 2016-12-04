package com.github.dsciencebk.rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by anna on 04.12.2016.
 */
@Path("/cars")
public class CarService {
//
//    @EJB
//    CarEJB carEJB;


    @GET
    @Path("/getall")
    @Produces(MediaType.APPLICATION_JSON)
    public Response  getAll(){
        return Response.ok().entity("hello").build();
    }



}
