package com.parkinglot;

import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingStrategyClass.NearToEntranceGateStrategy;
import com.parkinglot.PrintClass.PrintFactory;
import com.parkinglot.VehicleClass.Vehicle;

import java.util.List;

//main class object for parking lot
public class ParkingLot {

    ParkingSpotManager parkingSpotManager = new ParkingSpotManager();
    List<ParkingSpot> parkingSpotList;
    List<Vehicle> vehicleList;
    public ParkingLot()
    {
        parkingSpotList= parkingSpotManager.CreateParkingSpot();
        vehicleList = parkingSpotManager.CreateVehicle();
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
        PrintFactory.GetPrintObject(vehicle).Print();

        //find the parking space at entrance gate
        ParkingSpot parkingSpot = entranceGate.FindParkingSpace(vehicle.getVehicleType());

        ///park the vehicle in parking spot and generate ticket
        entranceGate.AllocateParkingSpot(vehicle,parkingSpot);

        PrintFactory.GetPrintObject(parkingSpot).Print();
        Ticket ticket = entranceGate.GenerateTicket(vehicle,parkingSpot);

        PrintFactory.GetPrintObject(ticket).Print();
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


        ParkingLot parkingLot = new ParkingLot();
        List<ParkingSpot> parkingSpots = parkingLot.getParkingSpotList();

        EntranceGate entranceGate = new EntranceGate(parkingSpots, new NearToEntranceGateStrategy()); //entrance gate
        ExitGate exitGate = new ExitGate(parkingSpots); //exit gate

        //5 vehicle entered at entrance gate
        Vehicle vehicle1 = parkingLot.getVehicleList().get(0); //entered vehicle
        Vehicle vehicle2 = parkingLot.getVehicleList().get(1); //entered vehicle
        Vehicle vehicle5 = parkingLot.getVehicleList().get(2); //entered vehicle
        Vehicle vehicle3 = parkingLot.getVehicleList().get(5); //entered vehicle
        Vehicle vehicle4 = parkingLot.getVehicleList().get(6); //entered vehicle


        Ticket ticket1 =  parkingLot.VehicleIn(entranceGate,vehicle1);
        Ticket ticket2 =  parkingLot.VehicleIn(entranceGate,vehicle2);
        Ticket ticket5 = parkingLot.VehicleIn(entranceGate,vehicle5);
        Ticket ticket3 = parkingLot.VehicleIn(entranceGate,vehicle3);
        Ticket ticket4 = parkingLot.VehicleIn(entranceGate,vehicle4);

        //1 Vehicle out from the exit gate
        parkingLot.VehicleOut(exitGate, ticket1);

        //1 vehicle entered at entrance gate
        Ticket ticket6 =  parkingLot.VehicleIn(entranceGate,vehicle5);

        //1 Vehicle out from the exit gate
        parkingLot.VehicleOut(exitGate, ticket6);
    }
}

