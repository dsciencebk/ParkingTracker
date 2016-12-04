package com.github.dsciencebk.entity;

import com.github.dsciencebk.dto.ParkingDTO;

import javax.persistence.*;
import javax.ws.rs.Consumes;
import java.util.Date;

@Entity
@Table(name = "parking")
@NamedQueries({
        @NamedQuery(name = "Parking.getAll",query = "SELECT p FROM Parking p"),
        @NamedQuery(name = "Parking.gerFrePlacesCount",query = "SELECT count(p) FROM Parking p WHERE isCarInParking = true")
})



public class Parking {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "parking_id", nullable = false)
    private int parkingId;
    @Column(name = "parking_start_time", nullable = false)
    private Date parkingStartTime;
    @Column(name = "car_number", nullable = false)
    private String carNumber;
    @Column(name = "car_name", nullable = false)
    private String carName;
    @Column (name = "car_in_parking", nullable = false)
    private Boolean isCarInParking;



    public Parking() {}
    public Parking(int parkingId, Date parkingStartTime, String carNumber, String carName) {
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
    public Boolean getCarInParking() {
        return isCarInParking;
    }

    public void setCarInParking(Boolean carInParking) {
        isCarInParking = carInParking;
    }

    public ParkingDTO toDTO(){
        return new ParkingDTO(this.parkingId, this.parkingStartTime, this.carNumber, this.carName);
    }
}
