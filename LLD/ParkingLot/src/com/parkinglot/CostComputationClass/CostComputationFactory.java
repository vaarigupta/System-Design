package com.parkinglot.CostComputationClass;

import com.parkinglot.Enum.VehicleType;
import com.parkinglot.PricingStrategyClass.HourlyPricingStrategy;
import com.parkinglot.PricingStrategyClass.PricingStrategy;

public class CostComputationFactory {

    public CostComputation GetCostComputationObject(VehicleType vehicleType)
    {
        if(vehicleType.equals(VehicleType.TWO_WHEELER))
            return new TwoWheelerCostComputation();
        else if(vehicleType.equals(VehicleType.FOUR_WHEELER))
            return  new FourWheelerCostComputation();
        else
            return new CostComputation(new HourlyPricingStrategy());
    }
}
