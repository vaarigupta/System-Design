package com.parkinglot.ParkingSpotClass;
import com.parkinglot.Enum.VehicleType;

public class FourWheelerParkingSpot extends ParkingSpot {
    public FourWheelerParkingSpot(int parkingSpotID) {
        super(parkingSpotID);

        vehicleType = VehicleType.FOUR_WHEELER;
    }

    public FourWheelerParkingSpot(int parkingSpotID, boolean isEmpty) {
        super(parkingSpotID, isEmpty);

        vehicleType = VehicleType.FOUR_WHEELER;
    }
}
