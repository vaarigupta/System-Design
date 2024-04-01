package com.parkinglot;

import com.parkinglot.Enum.Brand;
import com.parkinglot.Enum.Color;
import com.parkinglot.Enum.VehicleType;
import com.parkinglot.ParkingSpotClass.FourWheelerParkingSpot;
import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.ParkingSpotClass.TwoWheelerParkingSpot;
import com.parkinglot.VehicleClass.FourWheelerVehicle;
import com.parkinglot.VehicleClass.TwoWheelerVehicle;
import com.parkinglot.VehicleClass.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotData {

    List<ParkingSpot> parkingSpotList;
    List<Vehicle> vehicleList;

    public ParkingLotData()
    {
        parkingSpotList = new ArrayList<>();
        vehicleList = new ArrayList<>();
    }
    public  List<ParkingSpot> CreateParkingSpot()
    {
        for(int i=1;i<=5;i++)
        {
            parkingSpotList.add(new TwoWheelerParkingSpot(i));
        }

        for(int i=6;i<=15;i++)
        {
            parkingSpotList.add(new FourWheelerParkingSpot(i));
        }

        for(int i=16;i<=20;i++)
        {
            parkingSpotList.add(new TwoWheelerParkingSpot(i));
        }

        return  parkingSpotList;
    }

    public List<ParkingSpot> GetParkingSpotBasedOnVehicleType(VehicleType vehicleType)
    {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for(ParkingSpot p : parkingSpotList)
        {
            if(vehicleType.equals(p.getVehicleType()))
                parkingSpots.add(p);
        }
        return  parkingSpots;
    }
    public List<Vehicle> CreateVehicle()
    {

        vehicleList.add(new TwoWheelerVehicle(123, Brand.HONDA, VehicleType.TWO_WHEELER, Color.BLACK));
        vehicleList.add(new TwoWheelerVehicle(1456, Brand.HERO, VehicleType.TWO_WHEELER, Color.RED));
        vehicleList.add(new TwoWheelerVehicle(113, Brand.ATHER, VehicleType.TWO_WHEELER, Color.GREY));
        vehicleList.add(new TwoWheelerVehicle(173, Brand.BAJAJ, VehicleType.TWO_WHEELER, Color.WHITE));
        vehicleList.add(new TwoWheelerVehicle(190, Brand.TVS, VehicleType.TWO_WHEELER, Color.BLUE));

        vehicleList.add(new FourWheelerVehicle(300, Brand.MARUTI_SUZUKI, VehicleType.FOUR_WHEELER, Color.BLACK));
        vehicleList.add(new FourWheelerVehicle(400, Brand.TATAMOTORS, VehicleType.FOUR_WHEELER, Color.BLUE));
        vehicleList.add(new FourWheelerVehicle(500, Brand.HYUNDAI, VehicleType.FOUR_WHEELER, Color.RED));
        vehicleList.add(new FourWheelerVehicle(600, Brand.BMW, VehicleType.FOUR_WHEELER, Color.GREY));
        vehicleList.add(new FourWheelerVehicle(700, Brand.MERCEDES, VehicleType.FOUR_WHEELER, Color.WHITE));

        return vehicleList;

    }

    public void PrintParkingSpotList()
    {
        for(ParkingSpot p : parkingSpotList)
        {
            p.PrintParkingSpot();
        }
    }

    public void PrintVehicleList()
    {
        for(Vehicle v: vehicleList)
        {
            v.PrintVehicle();
        }
    }
}
