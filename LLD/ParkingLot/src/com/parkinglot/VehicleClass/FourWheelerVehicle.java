package com.parkinglot.VehicleClass;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;

public class FourWheelerVehicle extends Vehicle {

    public FourWheelerVehicle(int vehicleNo, Brand vehicleBrand, Color color) {
        super(vehicleNo, vehicleBrand, color);

        vehicleType = VehicleType.FOUR_WHEELER;
    }
}
