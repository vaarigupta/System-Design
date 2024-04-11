package com.inventorymanagement;

import java.util.List;

public interface WarehouseSelectionStrategy {

    Warehouse FindWarehouse(List<Warehouse> warehouseList, Address address);
}
