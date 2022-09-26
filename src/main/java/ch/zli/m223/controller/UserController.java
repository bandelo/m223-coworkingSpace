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

import ch.zli.m223.model.Buchung;
import ch.zli.m223.service.BuchungService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the User
 */

@Path("/user")
@Tag(name = "User", description = "Handling of User")
public class UserController {
    @Inject
    BuchungService buchungService;
}
