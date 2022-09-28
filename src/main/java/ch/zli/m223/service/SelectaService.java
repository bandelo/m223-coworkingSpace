package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Selecta;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the Selecta
 */

@ApplicationScoped
public class SelectaService {
    @Inject
    EntityManager entityManager;

    public List<Selecta> findAll() {
        var query = entityManager.createQuery("FROM Selecta", Selecta.class);
        return query.getResultList();
    }

    public Selecta findById(Long id){
        var selecta = entityManager.find(Selecta.class, id);
        return selecta;
    }

    @Transactional
    public Selecta createSelecta(Selecta selecta) {
        entityManager.persist(selecta);
        return selecta;
    }
}
