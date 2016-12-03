package com.github.dsciencebk.dao;

import javax.persistence.*;

/**
 * Created by anna on 03.12.2016.
 */
@Entity
@Table(name = "car", schema = "work")
public class CarDAO {
    @Id
    @Column(name = "car_id")
    private int carId;
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "car_name")
    private String carName;


    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarDAO carDAO = (CarDAO) o;

        if (carId != carDAO.carId) return false;
        if (carNumber != null ? !carNumber.equals(carDAO.carNumber) : carDAO.carNumber != null) return false;
        if (carName != null ? !carName.equals(carDAO.carName) : carDAO.carName != null) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = carId;
        result = 31 * result + (carNumber != null ? carNumber.hashCode() : 0);
        result = 31 * result + (carName != null ? carName.hashCode() : 0);
        return result;
    }
}
