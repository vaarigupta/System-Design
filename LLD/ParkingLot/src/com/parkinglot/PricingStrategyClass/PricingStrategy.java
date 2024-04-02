package com.parkinglot.PricingStrategyClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.Ticket;

public class PricingStrategy {

    float parkingFees;
    public PricingStrategy()
    {
        parkingFees = 20;
    }

    public float CalculateParkingFees(Ticket ticket)
    {
        return parkingFees;
    }
}
