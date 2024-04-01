package com.parkinglot.CostComputationClass;

import com.parkinglot.ParkingStrategyClass.ParkingStrategy;
import com.parkinglot.PricingStrategyClass.HourlyPricingStrategy;
import com.parkinglot.PricingStrategyClass.PricingStrategy;

public class FourWheelerCostComputation extends  CostComputation{


    public FourWheelerCostComputation() {

        super(new HourlyPricingStrategy());
    }
}
