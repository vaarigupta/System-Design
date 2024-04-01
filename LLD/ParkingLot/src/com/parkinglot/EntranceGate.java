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
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Vehicle vehicle;
    ParkingStrategy parkingStrategy;
    public EntranceGate(Vehicle vehicle, ParkingStrategy parkingStrategy)
    {
        parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        //we will get parking spot manager object based on vehicle type
        parkingSpotManager = parkingSpotManagerFactory.GetParkingSpotManager(vehicle.getVehicleType());
        this.parkingStrategy = parkingStrategy;
        this.vehicle = vehicle;
    }

    //find parking space/spot
    public ParkingSpot FindParkingSpace()
    {
        List<ParkingSpot> parkingSpotList =  parkingSpotManager.getParkingSpotBasedOnVehicleType(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingStrategy.FindParkingSpot(parkingSpotList);
        return parkingSpot;
    }

    //allocation of parking spot to a vehicle
    public void AllocateParkingSpot(ParkingSpot parkingSpot)
    {
        parkingSpot.setEmpty(false);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setVehicleType(vehicle.getVehicleType());
    }

    //generate a ticket for the vehicle
    public Ticket GenerateTicket( ParkingSpot parkingSpot)
    {
        Ticket ticket = new Ticket();
        ticket.setTickeID(parkingSpot.getParkingSpotID());
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);

        return ticket;
    }
}
