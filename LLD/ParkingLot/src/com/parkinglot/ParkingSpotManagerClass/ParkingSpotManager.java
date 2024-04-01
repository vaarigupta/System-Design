package com.parkinglot.ParkingSpotManagerClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingLotData;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpots;
  //  ParkingStrategy parkingStrategy;
    ParkingLotData parkingLotData;
    public  ParkingSpotManager()
    {
        parkingLotData = new ParkingLotData();
        parkingSpots = parkingLotData.CreateParkingSpot();
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public List<ParkingSpot> getParkingSpotBasedOnVehicleType(VehicleType vehicleType)
    {
        return parkingLotData.GetParkingSpotBasedOnVehicleType(vehicleType);
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

  /*  public ParkingStrategy getParkingStrategy() {
        return parkingStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }*/


    void ParkVehicle(){}
    void RemoveVehicle(){}
    void FindParkingSpace() {}
    void AddParkingSpace() {}
    void RemoveParkingSpace() {}
}
