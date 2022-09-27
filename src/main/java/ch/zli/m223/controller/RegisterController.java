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

import ch.zli.m223.model.Role;
import ch.zli.m223.model.User;
import ch.zli.m223.service.UserService;

/*
 * @author Andelo Batinic
 * @version 27.09 2022
 * This controller handles the endpoint for the register
 */

@Path("/register")
@Tag(name = "Register", description = "Handling of register")
public class RegisterController {
    @Inject
    UserService userService;

    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User create(User user) {
        user = userService.createUser(user);
        
        return user;
    }
}
