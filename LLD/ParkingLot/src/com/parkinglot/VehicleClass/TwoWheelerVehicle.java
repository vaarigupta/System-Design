package com.parkinglot.VehicleClass;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;

public class TwoWheelerVehicle extends Vehicle {

    public TwoWheelerVehicle(int vehicleNo, Brand vehicleBrand, Color color) {
        super(vehicleNo, vehicleBrand, color);

        vehicleType = VehicleType.TWO_WHEELER;
    }
}
