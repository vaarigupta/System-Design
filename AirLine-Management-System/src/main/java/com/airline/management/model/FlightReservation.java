package com.airline.management.model;

import com.airline.management.constant.ReservationStatus;

import java.util.Map;

public class FlightReservation {

    private String reservationNo;
    private FlightInstance flight;
    private ReservationStatus reservationStatus;
    private Map<Customer,FlightSeat> seatmap;
}
