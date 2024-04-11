package com.inventorymanagement;

import com.inventorymanagement.enums.PaymentMode;

public class CODPayment extends  Payment{

    public CODPayment(float amount)
    {
        super(amount);
        paymentMode = PaymentMode.CASH_ON_DELIVERY;
    }
}
