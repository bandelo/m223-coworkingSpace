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

import ch.zli.m223.model.User;
import ch.zli.m223.service.UserService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the User
 */

@Path("/user")
@Tag(name = "User", description = "Handling of User")
public class UserController {
    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)  
    public List<User> getUsers() {
        return userService.findAll();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getOneUser(@PathParam("id") Long id) {
        return userService.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User create(User user) {
        return userService.createUser(user);
    }

    @Path("/{id}")
    @PUT
    public User update(@PathParam("id") Long id, User user){
        return userService.updateUser(id, user);
    }

    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") Long id) {
        userService.deleteUser(id);
    }
}
