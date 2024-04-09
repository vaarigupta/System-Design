package com.inventorymanagement;

import java.util.List;

public class WarehouseController {

    List<Warehouse> warehouses;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController(WarehouseSelectionStrategy warehouseSelectionStrategy)
    {
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }


    void AddWarehouse(){}
    void RemoveWarehouse() {}
}
