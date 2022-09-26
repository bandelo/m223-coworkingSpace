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

import ch.zli.m223.model.Bereiche;
import ch.zli.m223.service.BereicheService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the Bereiche
 */

@Path("/bereiche")
@Tag(name = "Bereiche", description = "Handling of Bereiche")
public class BereicheController {
    
    @Inject
    BereicheService bereicheService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)   
    public List<Bereiche> getBereicheen() {
        return bereicheService.findAll();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Bereiche getOneBereich(@PathParam("id") Long id) {
        return bereicheService.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bereiche create(Bereiche bereich) {
        return bereicheService.createBereich(bereich);
    }

    @Path("/{id}")
    @PUT
    public Bereiche update(@PathParam("id") Long id, Bereiche bereiche){
        return bereicheService.updateBereich(id, bereiche);
    }

    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") Long id) {
        bereicheService.deleteBereich(id);
    }
}
