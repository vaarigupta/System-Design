package com.parkinglot.ParkingSpotClass;
import com.parkinglot.Enum.VehicleType;

public class ParkingSpotFactory {

    public static ParkingSpot GetParkingSpot(VehicleType vehicleType, int parkingSpotID)
    {
        if(vehicleType.equals(VehicleType.TWO_WHEELER))
        {
            return new TwoWheelerParkingSpot(parkingSpotID);
        }
        else if(vehicleType.equals(VehicleType.FOUR_WHEELER))
        {
            return new FourWheelerParkingSpot(parkingSpotID);
        }
        return new ParkingSpot(parkingSpotID);
    }
}
