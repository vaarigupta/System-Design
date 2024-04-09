package com.inventorymanagement;

import java.util.List;

public class NearestWarehouseSelectionStrategy implements  WarehouseSelectionStrategy {

    List<Warehouse> warehouseList;
    public  NearestWarehouseSelectionStrategy(List<Warehouse> warehouseList)
    {
        this.warehouseList = warehouseList;

    }
    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
