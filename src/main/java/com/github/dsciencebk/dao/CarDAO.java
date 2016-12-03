package com.github.dsciencebk.dto;

import javax.persistence.*;

/**
 * Created by anna on 03.12.2016.
 */
@Entity
@Table(name = "car", schema = "work", catalog = "")
public class CarEntity {
    private int carId;
    private String carNumber;
    private String carName;

    @Id
    @Column(name = "car_id")
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "car_number")
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Basic
    @Column(name = "car_name")
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

        CarEntity carEntity = (CarEntity) o;

        if (carId != carEntity.carId) return false;
        if (carNumber != null ? !carNumber.equals(carEntity.carNumber) : carEntity.carNumber != null) return false;
        if (carName != null ? !carName.equals(carEntity.carName) : carEntity.carName != null) return false;

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
