package com.parkinglot.VehicleClass;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;

public class Vehicle {

    int vehicleNo;
    Brand vehicleBrand;
    VehicleType vehicleType;
    Color color;

    public Vehicle(int vehicleNo, Brand vehicleBrand, Color color) {
        this.vehicleNo = vehicleNo;
        this.vehicleBrand = vehicleBrand;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Brand getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(Brand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

}
