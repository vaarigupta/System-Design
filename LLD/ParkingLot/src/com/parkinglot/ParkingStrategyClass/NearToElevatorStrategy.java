package com.parkinglot.ParkingStrategyClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;

import java.util.List;

public class NearToElevatorStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot FindParkingSpot(VehicleType vehicleType,List<ParkingSpot> parkingSpots) {

        System.out.println("It is near to elevator");
        return null;
    }
}
