package com.demo;
import java.lang.*;
import java.util.*;

public class Main {

    public static  void main(String[] args)
    {

        System.out.println("Example of Liskov Substitution Principle : ");
        System.out.println("Vehicle Specifications : ");

        Vehicle car1 = new Car();
        Vehicle motorcycle1 = new MotorCycle();
        Vehicle bicycle = new Bicyle();

        List<Vehicle> vehicleList = new ArrayList<>();

        EngineVehicle car2 = new Car();
        EngineVehicle car3 = new Car();
        EngineVehicle motorcycle2 = new MotorCycle();

        List<EngineVehicle> engineVehicleList = new ArrayList<>();

        vehicleList.add(car1);
        vehicleList.add(motorcycle1);
        vehicleList.add(bicycle);

        engineVehicleList.add(car2);
        engineVehicleList.add(car3);
        engineVehicleList.add(motorcycle2);

        System.out.println("All type of Vehicles : ");
        for (Vehicle vehicle:vehicleList) {
            System.out.println(vehicle.GetVehicleType() + " , No. of Wheels - " + vehicle.GetWheelsCount());
        }

        System.out.println("Engine Vehicles : ");
        for(EngineVehicle vehicle : engineVehicleList)
        {
            System.out.println(vehicle.GetVehicleType() + " , No. of Wheels -  " + vehicle.GetWheelsCount() + " ,Engine Present or Not - " + vehicle.HasEngine());
        }
    }
}
