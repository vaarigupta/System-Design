package com.parkinglot;

import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.NearToEntranceGateStrategy;
import com.parkinglot.VehicleClass.Vehicle;

import java.util.List;

//main class object for parking lot
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

    public Ticket VehicleIn( EntranceGate entranceGate,Vehicle vehicle)
    {
        System.out.print("Entered ");
        vehicle.PrintVehicle();
        //find the parking space at entrance gate
        ParkingSpot parkingSpot = entranceGate.FindParkingSpace(vehicle.getVehicleType());
        ///park the vehicle in parking spot and generate ticket
        entranceGate.AllocateParkingSpot(vehicle,parkingSpot);
        parkingSpot.PrintParkingSpot();
        Ticket ticket = entranceGate.GenerateTicket(vehicle,parkingSpot);
        ticket.PrintTicket();
        System.out.println();
        return  ticket;
    }

    public void VehicleOut(ExitGate exitGate, Ticket ticket)
    {
        //exit from the exit gate
        float parkingFees = exitGate.CalculateParkingFees(ticket);
        System.out.println("Parking fees : "+ parkingFees);

        exitGate.FreeParkingSpace(ticket);
        System.out.println();
    }
    public static void main(String[] args) {


        ParkingLotMain parkingLotMain = new ParkingLotMain();
        List<ParkingSpot> parkingSpots = parkingLotMain.getParkingSpotList();
        EntranceGate entranceGate = new EntranceGate(parkingSpots, new NearToEntranceGateStrategy());
        ExitGate exitGate = new ExitGate(parkingSpots);

        //vehicle entries at entrance gate
        Vehicle vehicle1 = parkingLotMain.getVehicleList().get(0); //entered vehicle
        Vehicle vehicle2 = parkingLotMain.getVehicleList().get(1); //entered vehicle
        Vehicle vehicle5 = parkingLotMain.getVehicleList().get(2); //entered vehicle
        Vehicle vehicle3 = parkingLotMain.getVehicleList().get(5); //entered vehicle
        Vehicle vehicle4 = parkingLotMain.getVehicleList().get(6); //entered vehicle


        Ticket ticket1 =  parkingLotMain.VehicleIn(entranceGate,vehicle1);
        Ticket ticket2 =  parkingLotMain.VehicleIn(entranceGate,vehicle2);
        Ticket ticket5 = parkingLotMain.VehicleIn(entranceGate,vehicle5);
        Ticket ticket3 = parkingLotMain.VehicleIn(entranceGate,vehicle3);
        Ticket ticket4 = parkingLotMain.VehicleIn(entranceGate,vehicle4);

        //exit from the exit gate


        parkingLotMain.VehicleOut(exitGate, ticket1);
        Ticket ticket6 =  parkingLotMain.VehicleIn(entranceGate,vehicle5);

        parkingLotMain.VehicleOut(exitGate, ticket6);

    }
}

