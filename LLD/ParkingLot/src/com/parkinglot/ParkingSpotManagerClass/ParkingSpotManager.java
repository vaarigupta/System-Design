package com.parkinglot.ParkingSpotManagerClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingLotData;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpots;
    ParkingLotData parkingLotData;
    public  ParkingSpotManager()
    {
        parkingLotData = new ParkingLotData();
        parkingSpots = parkingLotData.CreateParkingSpot();
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void  UpdateParkingSpot(ParkingSpot spot)
    {
        parkingLotData.UpdateParkingSpot(spot);
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }


    void ParkVehicle(){}
    void RemoveVehicle(){}
    void FindParkingSpace() {}
    void AddParkingSpace() {}
    void RemoveParkingSpace() {}
}
