package com.parkinglot;

import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.VehicleClass.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    int tickeID;
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    public int getTickeID() {
        return tickeID;
    }

    public void setTickeID(int tickeID) {
        this.tickeID = tickeID;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

}
