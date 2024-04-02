package com.parkinglot;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.ParkingStrategy;
import com.parkinglot.VehicleClass.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

public class EntranceGate {

    ParkingSpotManager parkingSpotManager;
    ParkingStrategy parkingStrategy;
    List<ParkingSpot> parkingSpotList;

    public EntranceGate(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy)
    {
        parkingSpotManager = new ParkingSpotManager();
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    //find parking space/spot
    public ParkingSpot FindParkingSpace(VehicleType vehicleType)
    {
        return parkingStrategy.FindParkingSpot(vehicleType,parkingSpotList);
    }

    //allocation of parking spot to a vehicle
    public void AllocateParkingSpot(Vehicle vehicle,ParkingSpot parkingSpot)
    {
        parkingSpot.setEmpty(false);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setVehicleType(vehicle.getVehicleType());
        parkingSpotManager.UpdateParkingSpot(parkingSpot);
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
