package com.github.dsciencebk.dto;

import com.github.dsciencebk.dao.CarDAO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by anna on 04.12.2016.
 */
@XmlRootElement
public class CarDTO {

    @XmlElement
    private int carId;
    @XmlElement
    private String carNumber;
    @XmlElement
    private String carName;

    public CarDTO(int carId, String carNumber, String carName) {
        this.carId = carId;
        this.carNumber = carNumber;
        this.carName = carName;
    }

    public CarDTO() {
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




    public CarDAO toDAO(){
        return new CarDAO(this.getCarId(),this.getCarNumber(),this.getCarName());
    }

}
