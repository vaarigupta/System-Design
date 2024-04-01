package com.parkinglot;

import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.NearToEntranceGateStrategy;
import com.parkinglot.VehicleClass.Vehicle;

import java.util.List;

public class ParkingLotMain {


    ParkingLotData parkingLotData = new ParkingLotData();
    List<ParkingSpot> parkingSpotList;
    List<Vehicle> vehicleList;

    public ParkingLotMain()
    {
        parkingSpotList= parkingLotData.CreateParkingSpot();
        vehicleList = parkingLotData.CreateVehicle();
    }


    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }


    public static void main(String[] args) {


        ParkingLotMain parkingLotMain = new ParkingLotMain();

        Vehicle vehicle = parkingLotMain.getVehicleList().get(0); //entered vehicle
        System.out.print("Entered ");
        vehicle.PrintVehicle();

        EntranceGate entranceGate = new EntranceGate(vehicle, new NearToEntranceGateStrategy());
        //find the parking space at entrance gate
        ParkingSpot parkingSpot = entranceGate.FindParkingSpace();
        ///park the vehicle in parking spot and generate ticket
        entranceGate.AllocateParkingSpot(parkingSpot);
        parkingSpot.PrintParkingSpot();
        Ticket ticket = entranceGate.GenerateTicket(parkingSpot);
        ticket.PrintTicket();

        //exit from the exit gate
        ExitGate exitGate = new ExitGate(ticket);

       float parkingFees = exitGate.CalculateParkingFees();
        System.out.println("Parking fees : "+ parkingFees);

        exitGate.FreeParkingSpace();

    }
}
//create main class object for parking lot
//vehicle entries at entrance gate