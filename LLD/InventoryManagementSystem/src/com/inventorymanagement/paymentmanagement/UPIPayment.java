package com.inventorymanagement.paymentmanagement;

import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.paymentmanagement.Payment;

public class UPIPayment extends Payment {

    public  UPIPayment(float amount)
    {
        super(amount);
        paymentMode = PaymentMode.UPI;
    }
}
