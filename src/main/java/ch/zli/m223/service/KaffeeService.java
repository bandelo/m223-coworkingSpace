package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Kaffee;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the kaffee
 */

@ApplicationScoped
public class KaffeeService {
    @Inject
    EntityManager entityManager;

    public List<Kaffee> findAll() {
        var query = entityManager.createQuery("FROM Kaffee", Kaffee.class);
        return query.getResultList();
    }

    public Kaffee findById(Long id){
        var kaffee = entityManager.find(Kaffee.class, id);
        return kaffee;
    }

    @Transactional
    public Kaffee createKaffee(Kaffee kaffee) {
        entityManager.persist(kaffee);
        return kaffee;
    }
}
