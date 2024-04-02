package com.parkinglot.ParkingSpotClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.VehicleClass.Vehicle;

public class ParkingSpot {

    int parkingSpotID;
    boolean isEmpty;
    Vehicle vehicle;
    float price;
    VehicleType vehicleType;

    public ParkingSpot(int parkingSpotID)
    {
        this(parkingSpotID,true);
    }
    public  ParkingSpot(int parkingSpotID, boolean isEmpty)
    {
        this.parkingSpotID = parkingSpotID;
        this.isEmpty = isEmpty;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public void setParkingSpotID(int parkingSpotID) {
        this.parkingSpotID = parkingSpotID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public void UpdateParkingSpot(ParkingSpot p)
    {
        this.parkingSpotID = p.getParkingSpotID();
        this.isEmpty = p.isEmpty();
        this.vehicle = p.getVehicle();
        this.vehicleType = p.getVehicleType();
    }

}
