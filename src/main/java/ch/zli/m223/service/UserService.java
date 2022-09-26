package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Buchung;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the User
 */

@ApplicationScoped
public class UserService {
    @Inject
    private EntityManager entityManager;
}
