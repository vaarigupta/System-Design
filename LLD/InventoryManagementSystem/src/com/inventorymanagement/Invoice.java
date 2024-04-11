package com.inventorymanagement;

import java.util.Map;

public class Invoice {

    int invoiceID;
    User user;
    Address deliveryAddress;
    Map<Integer,Integer> productStockIDvsCount;
    float amount;

    public Invoice(int invoiceID, User user, Address deliveryAddress, Map<Integer, Integer> productStockIDvsCount, float amount) {
        this.invoiceID = invoiceID;
        this.user = user;
        this.deliveryAddress = deliveryAddress;
        this.productStockIDvsCount = productStockIDvsCount;
        this.amount = amount;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Map<Integer, Integer> getProductStockIDvsCount() {
        return productStockIDvsCount;
    }

    public void setProductStockIDvsCount(Map<Integer, Integer> productStockIDvsCount) {
        this.productStockIDvsCount = productStockIDvsCount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
