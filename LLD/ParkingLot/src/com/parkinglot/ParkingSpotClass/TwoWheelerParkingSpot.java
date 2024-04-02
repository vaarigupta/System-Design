package com.parkinglot.ParkingSpotClass;

import com.parkinglot.Enum.VehicleType;

public class TwoWheelerParkingSpot extends ParkingSpot {
    public TwoWheelerParkingSpot(int parkingSpotID) {
        super(parkingSpotID);

        vehicleType = VehicleType.TWO_WHEELER;
    }

    public TwoWheelerParkingSpot(int parkingSpotID, boolean isEmpty) {
        super(parkingSpotID, isEmpty);

        vehicleType = VehicleType.TWO_WHEELER;
    }
}
