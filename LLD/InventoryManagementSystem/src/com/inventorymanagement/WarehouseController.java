package com.inventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {

    List<Warehouse> warehouseList;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController(WarehouseSelectionStrategy warehouseSelectionStrategy)
    {
        warehouseList = new ArrayList<Warehouse>();
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }
    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public WarehouseSelectionStrategy getWarehouseSelectionStrategy() {
        return warehouseSelectionStrategy;
    }

    public void setWarehouseSelectionStrategy(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }

    public void AddWarehouse(Warehouse warehouse){
        warehouseList.add(warehouse);
    }
    public  void RemoveWarehouse(Warehouse warehouse) {
        if(warehouseList.contains(warehouse))
        {
            warehouseList.remove(warehouse);
        }
    }

    public  Warehouse FindWareHouse(Address deliveryAddress)
    {
       return warehouseSelectionStrategy.FindWarehouse(warehouseList,deliveryAddress);
    }
}
