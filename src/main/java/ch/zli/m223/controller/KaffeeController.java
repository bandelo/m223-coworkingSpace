package ch.zli.m223.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Kaffee;
import ch.zli.m223.service.KaffeeService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the Kaffee
 */

@Path("/kaffee")
@Tag(name = "Kaffee", description = "Handling of Kaffee")
public class KaffeeController {
    
    @Inject
    KaffeeService kaffeeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)   
    public List<Kaffee> getKaffee() {
        return kaffeeService.findAll();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Kaffee getOneKaffee(@PathParam("id") Long id) {
        return kaffeeService.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Kaffee create(Kaffee kaffee) {
        return kaffeeService.createKaffee(kaffee);
    }
}
