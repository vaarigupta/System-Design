package com.parkinglot.ParkingStrategyClass;

import com.parkinglot.ParkingSpotClass.ParkingSpot;

import java.util.List;

public class NearToEntranceGateStrategy implements ParkingStrategy{

    @Override
    public ParkingSpot FindParkingSpot(List<ParkingSpot> parkingSpots) {

        for(ParkingSpot p : parkingSpots)
        {
            if(p.isEmpty())
                return p;
        }
        //System.out.println("It is near to entrance");
        return null;
    }
}
