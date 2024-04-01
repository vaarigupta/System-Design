package com.parkinglot.CostComputationClass;

import com.parkinglot.ParkingStrategyClass.ParkingStrategy;
import com.parkinglot.PricingStrategyClass.HourlyPricingStrategy;
import com.parkinglot.PricingStrategyClass.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation{


    public TwoWheelerCostComputation() {

        super(new HourlyPricingStrategy());
    }
}
