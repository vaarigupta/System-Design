package com.parkinglot.ParkingStrategyClass;

import com.parkinglot.ParkingSpotClass.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot FindParkingSpot(List<ParkingSpot> parkingSpots);
}
