package com.parkinglot.PricingStrategyClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.Ticket;

public class PricingStrategy {

   // VehicleType vehicleType;
    float parkingFees;
   // Ticket ticket;

    public PricingStrategy()
    {
        parkingFees = 20;

    }

    public float CalculateParkingFees(Ticket ticket)
    {
        return parkingFees;
    }
}
