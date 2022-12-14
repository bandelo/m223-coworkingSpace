package ch.zli.m223.controller;

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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.jwt.JsonWebToken;

/*
 * @author Andelo Batinic
 * @version 28.09 2022
 * This controller handles the endpoint for the Auth
 */

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.User;
import ch.zli.m223.service.AuthService;
import ch.zli.m223.service.UserService;

@Path("/auth")
@Tag(name = "Auth", description = "Handling of Auth")
public class AuthController {
    @Inject
    AuthService authService;

    @Inject
    UserService userService;

    @Inject
    JsonWebToken jwt; 

    @Path("/login")
    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String login(@QueryParam("email")String email, @QueryParam("password") String password) {
        return authService.findUser(email, password);
    }

    @Path("/register")
    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User create(User user) {
        return userService.createUser(user);
    }
}
