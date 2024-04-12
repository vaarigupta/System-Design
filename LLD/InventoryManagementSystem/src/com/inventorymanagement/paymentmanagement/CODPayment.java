package com.inventorymanagement.paymentmanagement;

import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.paymentmanagement.Payment;

public class CODPayment extends Payment {

    public CODPayment(float amount)
    {
        super(amount);
        paymentMode = PaymentMode.CASH_ON_DELIVERY;
    }
}
