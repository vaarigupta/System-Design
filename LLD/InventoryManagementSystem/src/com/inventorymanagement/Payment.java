package com.inventorymanagement;

import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.enums.PaymentStatus;

public class Payment {

    int paymentID;
    PaymentStatus paymentStatus;
    PaymentMode paymentMode;
    float amount;

    public Payment(float amount)
    {
        this.amount = amount;
    }
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean Pay()
    {
        return true;
    }
}
