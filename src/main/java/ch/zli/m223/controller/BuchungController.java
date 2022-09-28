package ch.zli.m223.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
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

import ch.zli.m223.model.Buchung;
import ch.zli.m223.service.BuchungService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the Buchung
 */

@Path("/buchung")
@Tag(name = "Buchungen", description = "Handling of Buchungen")
public class BuchungController {
    
    @Inject
    BuchungService buchungService;

    @GET
    @RolesAllowed({"admin", "mitglied"})
    @Produces(MediaType.APPLICATION_JSON)   
    public List<Buchung> getBuchungen() {
        return buchungService.findAll();
    }

    @Path("/{id}")
    @GET
    @RolesAllowed({"admin", "mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    public Buchung getOneBuchung(@PathParam("id") Long id) {
        if (id >= 1) {
            return buchungService.findById(id);
        } else {
            throw new IllegalArgumentException("Id should be greater than 1");
        }
    }

    @POST
    @RolesAllowed({"admin", "mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Buchung create(Buchung buchung) {
        return buchungService.createBuchung(buchung);
    }

    @Path("/{id}")
    @RolesAllowed({"admin"})
    @PUT
    public Buchung update(@PathParam("id") Long id, Buchung buchung){
        if (id >= 1) {
            return buchungService.updateBuchung(id, buchung);
        } else {
            throw new IllegalArgumentException("Id should be greater than 1");
        }
    }

    @Path("/{id}")
    @RolesAllowed({"admin", "mitglied"})
    @DELETE
    public void delete(@PathParam("id") Long id) {
        buchungService.deleteBuchung(id);
    }
}
