package ch.zli.m223.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.jwt.JsonWebToken;

import ch.zli.m223.model.User;

import io.smallrye.jwt.build.Jwt;

/*
 * @author Andelo Batinic
 * @version 28.09 2022
 * This service handles the endpoint-methods for the Auth
 */

@ApplicationScoped
public class AuthService {
    @Inject
    EntityManager entityManager;

    @Inject
    UserService userService;

    @Inject
    JsonWebToken jwt;

    @Transactional
    public String findUser(String email, String password) {
        List<User> users = userService.findAll();
        String jwt = "";
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                String token = Jwt.issuer("https://example.com/issuer")
                        .upn(user.getEmail())
                        .groups(user.getRole().getName())
                        .expiresIn(86400)
                        .sign();
                return token;
            } else {
                jwt = "Your email or password is wrong";
            }
        }
        return jwt;
    }
}
