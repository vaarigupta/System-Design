package com.inventorymanagement;

public class Warehouse {

    Inventory inventory;
    Address warehouseAddress;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Address getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(Address warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }
}
