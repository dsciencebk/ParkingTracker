package com.github.dsciencebk.dao;

import com.github.dsciencebk.dto.CarDTO;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Car.getAll",query = "SELECT c FROM CarDAO c")
@Table(name = "car")
public class CarDAO {
    @Id
    @Column(name = "car_id")
    private int carId;
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "car_name")
    private String carName;

    public CarDAO(int carId, String carNumber, String carName) {
        this.carId = carId;
        this.carNumber = carNumber;
        this.carName = carName;
    }

    public CarDAO() {
    }


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

    public CarDTO toDTO(){
        return new CarDTO(this.getCarId(),this.getCarNumber(),this.getCarName());
    }
}
