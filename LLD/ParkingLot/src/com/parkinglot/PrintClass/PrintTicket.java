package com.parkinglot.PrintClass;

import com.parkinglot.Ticket;

public class PrintTicket implements Print{

    Ticket ticket;
    public  PrintTicket(Ticket ticket)
    {
        this.ticket = ticket;
    }

    @Override
    public void Print()
    {
        System.out.print("Ticket : ");
        System.out.println("ID : " + ticket.getTickeID() + ", Entry time : " + ticket.getEntryTime() );
    }
}
