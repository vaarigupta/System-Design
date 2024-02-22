package com.airline.management.model;

import com.airline.management.constant.FlightStatus;

import java.util.Date;
import java.util.List;

public class FlightInstance {

    private Flight flight;
    private Date departureTime;
    private Date arrivalTime;
    private String gateNo;
    private FlightStatus flightStatus;
    private List<FlightSeat> flightSeats;

}
