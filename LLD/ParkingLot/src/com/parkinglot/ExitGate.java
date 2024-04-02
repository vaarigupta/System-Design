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

   // Ticket ticket;
   // Vehicle vehicle;
    CostComputationFactory costComputationFactory;
    CostComputation costComputation;
  //  ParkingSpotManagerFactory parkingSpotManagerFactory;
   // ParkingSpotManager parkingSpotManager;
    ParkingLotData parkingLotData;
    //payment object
    List<ParkingSpot> parkingSpotList;

    public ExitGate(List<ParkingSpot> parkingSpotList)
    {
       // this.ticket = ticket;
       /// this.vehicle = ticket.getVehicle();
        costComputationFactory = new CostComputationFactory();

        parkingLotData = new ParkingLotData();
        this.parkingSpotList = parkingSpotList;
      //  parkingSpotManagerFactory = new ParkingSpotManagerFactory();

   //     parkingSpotManager = parkingSpotManagerFactory.GetParkingSpotManager(this.vehicle.getVehicleType());
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
      //  parkingLotData.UpdateParkingSpot();
       // List<ParkingSpot> parkingSpotList = parkingLotData.CreateParkingSpot();
        for(ParkingSpot p : parkingSpotList)
        {
            if(p.getParkingSpotID() == ticket.getParkingSpot().getParkingSpotID())
            {
                System.out.println("Freed up Parking Spot with ID : " +
                        p.getParkingSpotID() + ",  now, " + p.getVehicle().getVehicleNo() +" " + p.getVehicle().getVehicleBrand()
                        + " got exit");
                p.setEmpty(true);
                p.setVehicle(null);
               // p.setVehicleType(null);

                return;
            }
        }
    }
}
