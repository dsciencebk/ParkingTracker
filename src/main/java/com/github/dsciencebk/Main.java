//package com.github.dsciencebk;
//
//import com.github.dsciencebk.dao.CarDAO;
//import com.github.dsciencebk.ejb.CarEJB;
//
//import javax.ejb.EJB;
//
///**
// * Created by anna on 04.12.2016.
// */
//public class Main {
//
//    @EJB
//    CarEJB carEJB;
//
//    public static void main(String...args){
//
//        CarDAO carDAO = new CarDAO();
//        carDAO.setCarName("Лада");
//        carDAO.setCarNumber("EM134O");
//        carEJB.add(carDAO);
//        System.out.printf(carEJB.getAll().toString());
//    }
//}
