package com.parkinglot.PrintClass;

import com.parkinglot.VehicleClass.Vehicle;

public class PrintVehicle implements Print{

    Vehicle vehicle;
    public  PrintVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    @Override
    public  void Print()
    {
        System.out.print("Vehicle : ");
        System.out.println(vehicle.getVehicleNo() + " " + vehicle.getVehicleBrand() + " " + vehicle.getVehicleType() + " " + vehicle.getColor());
    }
}
