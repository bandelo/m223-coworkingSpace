package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.User;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the Auth
 */

@ApplicationScoped
public class AuthService {
    @Inject
    EntityManager entityManager;

    @Inject
    UserService userService;

    @Transactional
    public boolean findUser(String email, String password) {
        List<User> users = userService.findAll();
        System.out.println(users);
        Boolean state = false;
        for (User user: users) {
            System.out.println(user.getEmail());
            System.out.println(email);
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("true");
                return state = true;
            } else {
                System.out.println("wrong");
                return state = false;
            }
        }
        return state;
    }
}
