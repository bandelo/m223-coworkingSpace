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
 * This service handles the endpoint-methods for the Buchung
 */

@ApplicationScoped
public class BuchungService {
    @Inject
    EntityManager entityManager;

    public List<Buchung> findAll() {
        var query = entityManager.createQuery("FROM Buchung", Buchung.class);
        return query.getResultList();
    }

    public Buchung findById(Long id){
        var buchung = entityManager.find(Buchung.class, id);
        return buchung;
    }

    @Transactional
    public Buchung createBuchung(Buchung buchung) {
        entityManager.persist(buchung);
        return buchung;
    }

    @Transactional
    public Buchung updateBuchung(Long id, Buchung buchung) {
        return entityManager.merge(buchung);
    }

    @Transactional
    public void deleteBuchung(Long id) {
        var buchung = entityManager.find(Buchung.class, id);
        entityManager.remove(buchung);
    }
}
