package com.inventorymanagement;

import com.inventorymanagement.enums.OrderStatus;
import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.enums.PaymentStatus;

import java.util.List;
import java.util.Map;

public class Order {

    int orderID;
    User user;
    Address deliveryAddress;
    OrderStatus orderStatus;
    Map<Integer,Integer> productStockIDvsCount;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;

    public Order( User user, Address deliveryAddress) {
        this.user = user;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(User user, Address deliveryAddress, Warehouse warehouse) {
        this.user = user;
        this.deliveryAddress = deliveryAddress;
        this.warehouse = warehouse;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Map<Integer, Integer> getProductStockIDvsCount() {
        return productStockIDvsCount;
    }

    public void setProductStockIDvsCount(Map<Integer, Integer> productStockIDvsCount) {
        this.productStockIDvsCount = productStockIDvsCount;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



}
