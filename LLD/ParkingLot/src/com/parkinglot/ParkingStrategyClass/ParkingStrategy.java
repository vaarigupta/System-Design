package com.parkinglot.ParkingStrategyClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot FindParkingSpot(VehicleType vehicleType,List<ParkingSpot> parkingSpots);
}
