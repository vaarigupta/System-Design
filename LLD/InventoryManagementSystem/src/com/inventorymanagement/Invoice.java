package com.inventorymanagement;

import java.util.Map;

public class Invoice {

    int invoiceID;
    User user;
    Address deliveryAddress;
    Map<Integer,Integer> productStockIDvsCount;
    float amount;
}
