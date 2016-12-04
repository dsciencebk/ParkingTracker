package com.github.dsciencebk.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.github.dsciencebk.dao.CarDAO;

import java.util.List;

@Stateless
public class CarEJB {

    @PersistenceContext(unitName = "MySqlDS")
    private EntityManager em;

    public CarEJB(){}



    public void add(CarDAO carDAO){
            em.persist(carDAO);

    }
    public void delete(int id){
        em.remove(getUser(id));
    }

    public CarDAO getUser(int id){
        return em.find(CarDAO.class, id);

    }
    public void update(CarDAO user){
        em.merge(user);
    }

//    public List<CarDAO> getAll(){
//        TypedQuery<CarDAO> namedQuery = em.createNamedQuery("Car.getAll", CarDAO.class);
//        return namedQuery.getResultList();
//    }

}