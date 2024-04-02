package com.parkinglot.VehicleClass;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;

public class VehicleFactory {

    public  static Vehicle GetVehicle(int vehicleNo, Brand vehicleBrand, VehicleType vehicleType, Color color)
    {
        if(vehicleType.equals(VehicleType.TWO_WHEELER))
        {
            return new TwoWheelerVehicle(vehicleNo,vehicleBrand,color);
        }
        else if(vehicleType.equals(VehicleType.FOUR_WHEELER))
        {
            return  new FourWheelerVehicle(vehicleNo,vehicleBrand,color);
        }

        return new Vehicle(vehicleNo,vehicleBrand,color);
    }
}
