package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Role;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the Role
 */

@ApplicationScoped
public class RoleService {
    @Inject
    EntityManager entityManager;

    public List<Role> findAll() {
        var query = entityManager.createQuery("FROM Role", Role.class);
        return query.getResultList();
    }

    public Role findById(Long id){
        var role = entityManager.find(Role.class, id);
        return role;
    }

    @Transactional
    public Role createRole(Role role) {
        entityManager.persist(role);
        return role;
    }
}
