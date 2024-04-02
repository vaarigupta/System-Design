package com.parkinglot;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingSpotManagerClass.ParkingSpotManager;
import com.parkinglot.ParkingSpotManagerClass.ParkingSpotManagerFactory;
import com.parkinglot.ParkingStrategyClass.ParkingStrategy;
import com.parkinglot.VehicleClass.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

public class EntranceGate {

   // ParkingSpotManagerFactory parkingSpotManagerFactory;
  //  ParkingSpotManager parkingSpotManager;
    ParkingLotData parkingLotData;
  //  Vehicle vehicle;
    ParkingStrategy parkingStrategy;
    List<ParkingSpot> parkingSpotList;

    public EntranceGate(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy)
    {
       // parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        parkingLotData = new ParkingLotData();
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }
/*    public EntranceGate(Vehicle vehicle, ParkingStrategy parkingStrategy)
    {
        parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        //we will get parking spot manager object based on vehicle type
        parkingSpotManager = parkingSpotManagerFactory.GetParkingSpotManager(vehicle.getVehicleType());
        this.parkingSpotList =  parkingSpotManager.getParkingSpotBasedOnVehicleType(vehicle.getVehicleType());

        this.vehicle = vehicle;
    }*/

    //find parking space/spot
    public ParkingSpot FindParkingSpace(VehicleType vehicleType)
    {
      //  parkingSpotManager = parkingSpotManagerFactory.GetParkingSpotManager(vehicleType);
     //   List<ParkingSpot> parkingSpotList = parkingSpotManager.getParkingSpotBasedOnVehicleType(vehicleType);
        return parkingStrategy.FindParkingSpot(vehicleType,parkingSpotList);
    }

    //allocation of parking spot to a vehicle
    public void AllocateParkingSpot(Vehicle vehicle,ParkingSpot parkingSpot)
    {
        parkingSpot.setEmpty(false);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setVehicleType(vehicle.getVehicleType());

        parkingLotData.UpdateParkingSpot(parkingSpot);
        //parkingSpotManager.UpdateParkingSpot(parkingSpot);
/*        for(ParkingSpot p: parkingSpotList)
        {
            if(p.getParkingSpotID() == parkingSpot.getParkingSpotID())
            {
                p.setEmpty(parkingSpot.isEmpty());
                p.setVehicle(parkingSpot.getVehicle());
                p.setVehicleType(parkingSpot.getVehicleType());
                return;
            }
        }*/
    }

    //generate a ticket for the vehicle
    public Ticket GenerateTicket( Vehicle vehicle, ParkingSpot parkingSpot)
    {
        Ticket ticket = new Ticket();
        ticket.setTickeID(parkingSpot.getParkingSpotID());
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);

        return ticket;
    }
}
