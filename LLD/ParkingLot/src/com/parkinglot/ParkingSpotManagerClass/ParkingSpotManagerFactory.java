package com.parkinglot.ParkingSpotManagerClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.ParkingStrategy;

import java.util.List;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager GetParkingSpotManager(VehicleType vehicleType)
    {
        if(vehicleType.equals(VehicleType.TWO_WHEELER))
        {
            return new TwoWheelerParkingSpotManager();
        }
        else if(vehicleType.equals(VehicleType.FOUR_WHEELER))
        {
            return new FourWheelerParkingSpotManager();
        }

        return new ParkingSpotManager();
    }
}
