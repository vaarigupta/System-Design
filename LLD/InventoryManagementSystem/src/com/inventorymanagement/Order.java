package com.inventorymanagement;

import com.inventorymanagement.enums.OrderStatus;

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
}
