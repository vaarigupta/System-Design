package com.inventorymanagement.warehousemanagement;

import com.inventorymanagement.Address;
import com.inventorymanagement.warehousemanagement.Warehouse;

import java.util.List;

public interface WarehouseSelectionStrategy {

    Warehouse FindWarehouse(List<Warehouse> warehouseList, Address address);
}
