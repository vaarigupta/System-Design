package com.parkinglot.PrintClass;

import com.parkinglot.ParkingSpotClass.ParkingSpot;
import com.parkinglot.Ticket;
import com.parkinglot.VehicleClass.Vehicle;

public class PrintFactory {

    public static Print GetPrintObject(Object obj)
    {
        //Object Vehicle = null;
        if(obj instanceof Vehicle)
        {
            return new PrintVehicle((Vehicle)obj);
        }
        else if(obj instanceof ParkingSpot)
        {
            return new PrintParkingSpot((ParkingSpot)obj);
        }

        else  if(obj instanceof Ticket)
        {
            return new PrintTicket((Ticket)obj );
        }
        return null;
    }
}
