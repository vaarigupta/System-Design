package com.parkinglot.CostComputationClass;

import com.parkinglot.ParkingStrategyClass.ParkingStrategy;
import com.parkinglot.PricingStrategyClass.PricingStrategy;
import com.parkinglot.Ticket;

public class CostComputation {

    PricingStrategy pricingStrategy;
    public  CostComputation(PricingStrategy pricingStrategy)
    {
        this.pricingStrategy = pricingStrategy;
    }

    public float CalculateParkingFees(Ticket ticket)
    {
       return pricingStrategy.CalculateParkingFees(ticket);
    }

}
