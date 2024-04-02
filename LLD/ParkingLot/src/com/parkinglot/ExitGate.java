package com.parkinglot;

import com.parkinglot.CostComputationClass.CostComputation;
import com.parkinglot.CostComputationClass.CostComputationFactory;
import com.parkinglot.ParkingSpotClass.ParkingSpot;

import java.util.List;

public class ExitGate {

    CostComputationFactory costComputationFactory;
    CostComputation costComputation;
    List<ParkingSpot> parkingSpotList;
    //payment object

    public ExitGate(List<ParkingSpot> parkingSpotList)
    {
        this.parkingSpotList = parkingSpotList;
        costComputationFactory = new CostComputationFactory();
    }

    //calculate Price from cost computation factory
    public float CalculateParkingFees(Ticket ticket)
    {
        costComputation = costComputationFactory.GetCostComputationObject(ticket.getVehicle().getVehicleType());
        return costComputation.CalculateParkingFees(ticket);
    }

    //remove vehicle
    public void FreeParkingSpace(Ticket ticket)
    {
        for(ParkingSpot p : parkingSpotList)
        {
            if(p.getParkingSpotID() == ticket.getParkingSpot().getParkingSpotID())
            {
                System.out.println("Freed up Parking Spot with ID : " +
                        p.getParkingSpotID() + ",  now, " + p.getVehicle().getVehicleNo() +" " + p.getVehicle().getVehicleBrand()
                        + " got exit");
                p.setEmpty(true);
                p.setVehicle(null);
                return;
            }
        }
    }
}
