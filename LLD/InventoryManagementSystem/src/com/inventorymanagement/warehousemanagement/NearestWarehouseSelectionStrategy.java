package com.inventorymanagement.warehousemanagement;

import com.inventorymanagement.Address;
import com.inventorymanagement.warehousemanagement.Warehouse;
import com.inventorymanagement.warehousemanagement.WarehouseSelectionStrategy;

import java.util.List;

public class NearestWarehouseSelectionStrategy implements WarehouseSelectionStrategy {

    @Override
    public Warehouse FindWarehouse(List<Warehouse> warehouseList, Address deliveryAddress) {

        for(Warehouse warehouse : warehouseList)
        {
            if(warehouse.getWarehouseAddress().getPincode()== deliveryAddress.getPincode())
                return warehouse;
        }
        return warehouseList.get(0);
    }
}
