package com.parkinglot;

import com.parkinglot.CostComputationClass.CostComputation;
import com.parkinglot.CostComputationClass.CostComputationFactory;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingSpotManagerClass.ParkingSpotManager;
import com.parkinglot.ParkingSpotManagerClass.ParkingSpotManagerFactory;
import com.parkinglot.PricingStrategyClass.PricingStrategy;
import com.parkinglot.VehicleClass.Vehicle;

import java.util.List;

public class ExitGate {

    Ticket ticket;
    Vehicle vehicle;
    PricingStrategy pricingStrategy;
    CostComputationFactory costComputationFactory;
    CostComputation costComputation;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    //payment object

    public ExitGate(Ticket ticket)
    {
        this.ticket = ticket;
        this.pricingStrategy = pricingStrategy;
        this.vehicle = ticket.getVehicle();
        costComputationFactory = new CostComputationFactory();
        parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        costComputation = costComputationFactory.GetCostComputationObject(this.vehicle.getVehicleType());
        parkingSpotManager = parkingSpotManagerFactory.GetParkingSpotManager(this.vehicle.getVehicleType());
    }
    //calculate Price from cost computation factory
    public float CalculateParkingFees()
    {
       return costComputation.CalculateParkingFees(ticket);
    }

    //remove vehicle
    public void FreeParkingSpace()
    {
        List<ParkingSpot> parkingSpotList = parkingSpotManager.getParkingSpots();
        for(ParkingSpot p : parkingSpotList)
        {
            if(p.getParkingSpotID() == ticket.getParkingSpot().getParkingSpotID())
            {
                p.setEmpty(true);
                System.out.println("Freed up Parking Spot with ID : " + p.getParkingSpotID() + "now , vehicle got exit");
                return;
            }
        }
    }
}
