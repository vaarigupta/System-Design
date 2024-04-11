package com.inventorymanagement;

import com.inventorymanagement.enums.PaymentMode;

public class UPIPayment extends Payment{

    public  UPIPayment(float amount)
    {
        super(amount);
        paymentMode = PaymentMode.UPI;
    }
}
