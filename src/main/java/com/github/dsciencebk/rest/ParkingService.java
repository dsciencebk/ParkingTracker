package com.github.dsciencebk.rest;



import com.github.dsciencebk.dao.ParkingDAO;
import com.github.dsciencebk.dto.ParkingDTO;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;


@Path("/parkings")
public class ParkingService {

    @EJB
    ParkingDAO parkingDAO;


    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response  getAll(){
        return Response.ok().entity(parkingDAO.getAll()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Response get(@PathParam("id") int id){
        return Response.ok().entity(parkingDAO.getParkingUnit(id)).build();
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(ParkingDTO parkingDTO){
        parkingDTO.setParkingStartTime(new Date());
        parkingDAO.add(parkingDTO.fromDTO());
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, ParkingDTO parkingDTO){
        parkingDAO.update(parkingDTO.fromDTO());
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") int id){
        parkingDAO.delete(id);
        return Response.ok().build();
    }


}
