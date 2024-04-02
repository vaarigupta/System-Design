package com.parkinglot.PrintClass;

import com.parkinglot.ParkingSpotClass.ParkingSpot;

public class PrintParkingSpot implements  Print{

    ParkingSpot parkingSpot;
    public PrintParkingSpot(ParkingSpot parkingSpot)
    {
        this.parkingSpot = parkingSpot;
    }
    public void Print()
    {
        System.out.print("Parking spot : ");
        System.out.println( "ID : " + parkingSpot.getParkingSpotID() + ", Availability: " + parkingSpot.isEmpty() );
        System.out.println( "Parked " + parkingSpot.getVehicle().getVehicleNo() +
                " " + parkingSpot.getVehicle().getVehicleBrand() +
                " " + parkingSpot.getVehicle().getColor());
    }
}
