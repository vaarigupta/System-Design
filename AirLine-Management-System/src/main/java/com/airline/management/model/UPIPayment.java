package com.airline.management.model;

import com.airline.management.constant.PaymentStatus;

public class UPIPayment implements  Payment{

    private String transactionID;
    private String upiID;
    private double amount;
    private PaymentStatus paymentStatus;

    public void pay(double amount)
    {

    }
}
