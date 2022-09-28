package ch.zli.m223.controller;

import java.util.List;

import javax.annotation.security.PermitAll;
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

import ch.zli.m223.model.Selecta;
import ch.zli.m223.service.SelectaService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the Selecta
 */

@Path("/selecta")
@Tag(name = "Selecta", description = "Handling of Selecta")
public class SelectaController {
    
    @Inject
    SelectaService selectaService;

    @GET
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)   
    public List<Selecta> getSelecta() {
        return selectaService.findAll();
    }

    @Path("/{id}")
    @GET
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public Selecta getOneSelecta(@PathParam("id") Long id) {
        return selectaService.findById(id);
    }

    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Selecta create(Selecta selecta) {
        return selectaService.createSelecta(selecta);
    }
}
