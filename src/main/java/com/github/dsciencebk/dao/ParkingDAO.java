package com.github.dsciencebk.dao;

import com.github.dsciencebk.entity.Parking;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import java.util.List;

@Stateless
public class ParkingDAO {

    @PersistenceContext(unitName = "VOLKOVA")
    private EntityManager em;

    public ParkingDAO(){}



    public void add(Parking parking){
            parking.setCarInParking(true);
            em.persist(parking);
    }
    public void delete(int id){
        em.remove(getParkingUnit(id));
    }

    public Parking getParkingUnit(int id){
        return em.find(Parking.class, id);

    }
    public void update(Parking parking){
        em.merge(parking);
    }

    public List<Parking> getAll(){
        TypedQuery<Parking> namedQuery = em.createNamedQuery("Parking.getAll", Parking.class);
        return namedQuery.getResultList();
    }

    public int gerFrePlacesCount(){
        TypedQuery namedQuery = em.createNamedQuery("Parking.gerFrePlacesCount", Parking.class);
        return namedQuery.getFirstResult();
    }

}