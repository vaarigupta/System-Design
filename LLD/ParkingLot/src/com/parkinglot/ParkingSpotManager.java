package com.parkinglot;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingSpotClass.ParkingSpotFactory;
import com.parkinglot.PrintClass.PrintFactory;
import com.parkinglot.VehicleClass.Vehicle;
import com.parkinglot.VehicleClass.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpotList;
    List<Vehicle> vehicleList;

    public ParkingSpotManager()
    {
        parkingSpotList = new ArrayList<>();
        vehicleList = new ArrayList<>();
    }
    public  List<ParkingSpot> CreateParkingSpot()
    {
        for(int i=1;i<=5;i++)
        {
            parkingSpotList.add( ParkingSpotFactory.GetParkingSpot(VehicleType.TWO_WHEELER,i));
        }

        for(int i=6;i<=15;i++)
        {
            parkingSpotList.add( ParkingSpotFactory.GetParkingSpot(VehicleType.FOUR_WHEELER,i));
        }

        for(int i=16;i<=20;i++)
        {
            parkingSpotList.add( ParkingSpotFactory.GetParkingSpot(VehicleType.TWO_WHEELER,i));
        }

        return  parkingSpotList;
    }

    public List<Vehicle> CreateVehicle()
    {

        vehicleList.add(VehicleFactory.GetVehicle(123, Brand.HONDA, VehicleType.TWO_WHEELER, Color.BLACK));
        vehicleList.add(VehicleFactory.GetVehicle(1456, Brand.HERO, VehicleType.TWO_WHEELER, Color.RED));
        vehicleList.add(VehicleFactory.GetVehicle(113, Brand.ATHER, VehicleType.TWO_WHEELER, Color.GREY));
        vehicleList.add(VehicleFactory.GetVehicle(173, Brand.BAJAJ, VehicleType.TWO_WHEELER, Color.WHITE));
        vehicleList.add(VehicleFactory.GetVehicle(190, Brand.TVS, VehicleType.TWO_WHEELER, Color.BLUE));

        vehicleList.add(VehicleFactory.GetVehicle(300, Brand.MARUTI_SUZUKI, VehicleType.FOUR_WHEELER, Color.BLACK));
        vehicleList.add(VehicleFactory.GetVehicle(400, Brand.TATAMOTORS, VehicleType.FOUR_WHEELER, Color.BLUE));
        vehicleList.add(VehicleFactory.GetVehicle(500, Brand.HYUNDAI, VehicleType.FOUR_WHEELER, Color.RED));
        vehicleList.add(VehicleFactory.GetVehicle(600, Brand.BMW, VehicleType.FOUR_WHEELER, Color.GREY));
        vehicleList.add(VehicleFactory.GetVehicle(700, Brand.MERCEDES, VehicleType.FOUR_WHEELER, Color.WHITE));

        return vehicleList;

    }


    public void UpdateParkingSpot(ParkingSpot spot)
    {
        for(int i=0;i<parkingSpotList.size();i++)
        {
            if(parkingSpotList.get(i).getParkingSpotID()== spot.getParkingSpotID())
            {
                parkingSpotList.get(i).UpdateParkingSpot(spot);
            }
        }
    }

    public void PrintParkingSpotList()
    {
        for(ParkingSpot p : parkingSpotList)
        {
            PrintFactory.GetPrintObject(p).Print();

        }
    }

    public void PrintVehicleList()
    {
        for(Vehicle v: vehicleList)
        {
            PrintFactory.GetPrintObject(v).Print();
        }
    }
}
