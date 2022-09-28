package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;

import ch.zli.m223.model.Bereiche;

/*
 * @author Andelo Batinic
 * @version 26.09 2022
 * This service handles the endpoint-methods for the Bereiche
 */

@ApplicationScoped
public class BereicheService {
    @Inject
    EntityManager entityManager;

    public List<Bereiche> findAll() {
        var query = entityManager.createQuery("FROM Bereiche", Bereiche.class);
        return query.getResultList();
    }

    public Bereiche findById(Long id){
        var bereiche = entityManager.find(Bereiche.class, id);
        return bereiche;
    }

    @Transactional
    public Bereiche createBereich(Bereiche bereich) {
        entityManager.persist(bereich);
        return bereich;
    }

    @Transactional
    public Bereiche updateBereich(Long id, Bereiche bereich) {
        return entityManager.merge(bereich);
    }

    @Transactional
    public void deleteBereich(Long id) {
        var bereich = entityManager.find(Bereiche.class, id);
        entityManager.remove(bereich);
    }
}
