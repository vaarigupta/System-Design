package com.parkinglot.PricingStrategyClass;

import com.parkinglot.Ticket;

import java.time.LocalDateTime;

public class HourlyPricingStrategy extends  PricingStrategy{

    @Override
    public float CalculateParkingFees(Ticket ticket) {

        LocalDateTime entryTime = ticket.getEntryTime();
        int hour = entryTime.getHour();
        float totalTime = (((hour+4)%24) - hour)*10;
        return totalTime;

    }
}
