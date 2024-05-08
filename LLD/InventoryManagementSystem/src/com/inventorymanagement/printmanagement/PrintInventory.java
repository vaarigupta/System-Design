package com.inventorymanagement.printmanagement;

import com.inventorymanagement.warehousemanagement.Inventory;

public class PrintInventory implements  Print{


    Inventory inventory;
    public PrintInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }
    @Override
    public void print() {

        System.out.println(inventory.getInventoryID() + " ");
    }
}
