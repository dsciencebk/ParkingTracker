package com.github.dsciencebk.dao;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "parking")
public class ParkingDAO {
    @Id
    @Column(name = "parking_id")
    private int parkingId;
    @Column(name = "car_id")
    private Integer carId;
    @Column(name = "parking_number")
    private Integer parkingNumber;
    @Column(name = "parking_start_time")
    private Timestamp parkingStartTime;
    @Column(name = "parking_end_time")
    private Timestamp parkingEndName;

    public ParkingDAO(int parkingId) {

    }

    public int getParkingId() {
        return parkingId;
    }
    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public Integer getCarId() {
        return carId;
    }
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getParkingNumber() {
        return parkingNumber;
    }
    public void setParkingNumber(Integer parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public Timestamp getParkingStartTime() {
        return parkingStartTime;
    }
    public void setParkingStartTime(Timestamp parkingStartTime) {
        this.parkingStartTime = parkingStartTime;
    }

    public Timestamp getParkingEndName() {
        return parkingEndName;
    }
    public void setParkingEndName(Timestamp parkingEndName) {
        this.parkingEndName = parkingEndName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParkingDAO that = (ParkingDAO) o;

        if (parkingId != that.parkingId) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (parkingNumber != null ? !parkingNumber.equals(that.parkingNumber) : that.parkingNumber != null)
            return false;
        if (parkingStartTime != null ? !parkingStartTime.equals(that.parkingStartTime) : that.parkingStartTime != null)
            return false;
        if (parkingEndName != null ? !parkingEndName.equals(that.parkingEndName) : that.parkingEndName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parkingId;
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (parkingNumber != null ? parkingNumber.hashCode() : 0);
        result = 31 * result + (parkingStartTime != null ? parkingStartTime.hashCode() : 0);
        result = 31 * result + (parkingEndName != null ? parkingEndName.hashCode() : 0);
        return result;
    }
}
