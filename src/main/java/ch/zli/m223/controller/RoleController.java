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

import ch.zli.m223.model.Role;
import ch.zli.m223.service.RoleService;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This controller handles the endpoint for the Role
 */

@Path("/role")
@Tag(name = "Role", description = "Handling of Role")
public class RoleController {
    
    @Inject
    RoleService roleService;

    @GET
    @RolesAllowed({"admin"})
    @Produces(MediaType.APPLICATION_JSON)   
    public List<Role> getRole() {
        return roleService.findAll();
    }

    @Path("/{id}")
    @GET
    @RolesAllowed({"admin"})
    @Produces(MediaType.APPLICATION_JSON)
    public Role getOneRole(@PathParam("id") Long id) {
        return roleService.findById(id);
    }

    @POST
    @RolesAllowed({"admin"})
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Role create(Role role) {
        return roleService.createRole(role);
    }
}
