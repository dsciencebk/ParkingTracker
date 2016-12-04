package com.github.dsciencebk.dto;

import com.github.dsciencebk.entity.Parking;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement
public class ParkingDTO {
    @XmlElement(name = "parkingId")
    private int parkingId;
    @XmlElement(name = "parkingStartTime")
    private Date parkingStartTime;
    @XmlElement(name = "carNumber")
    private String carNumber;
    @XmlElement(name = "carName")
    private String carName;
    @XmlElement (name = "isCarInParking",defaultValue = "true")
    Boolean isCarInParking;

    public ParkingDTO() {}
    public ParkingDTO(int parkingId, Date parkingStartTime, String carNumber, String carName) {
        this.parkingId = parkingId;
        this.parkingStartTime = parkingStartTime;
        this.carNumber = carNumber;
        this.carName = carName;
    }

    public int getParkingId() {
        return parkingId;
    }
    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }
    public Date getParkingStartTime() {
        return parkingStartTime;
    }
    public void setParkingStartTime(Date parkingStartTime) {
        this.parkingStartTime = parkingStartTime;
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

    public Parking fromDTO(){
        return new Parking(this.parkingId, this.parkingStartTime, this.carNumber, this.carName);
    }
}
