package com.inventorymanagement.paymentmanagement;

import com.inventorymanagement.enums.PaymentMode;

public class PaymentFactory {

    public static Payment GetPaymentMethod(PaymentMode paymentMode, float amount)
    {
        if(paymentMode.equals(PaymentMode.CASH_ON_DELIVERY))
            return new CODPayment(amount);
        else if(paymentMode.equals(PaymentMode.UPI))
            return  new UPIPayment(amount);
        else
            return new Payment(amount);
    }
}
