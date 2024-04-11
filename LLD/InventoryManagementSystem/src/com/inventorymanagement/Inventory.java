package com.inventorymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    int inventoryID;
    Map<Integer, ProductStock> productStocks;

    public  Inventory()
    {
        productStocks = new HashMap<Integer, ProductStock>();
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }


    public Map<Integer, ProductStock> getProductStocks() {
        return productStocks;
    }

    public void setProductStocks(Map<Integer, ProductStock> productStocks) {
        this.productStocks = productStocks;
    }
    public void addProductStock(ProductStock productStock){
        productStocks.put(productStock.getStockID(),productStock);
    };

    public  void RemoveProductStock(ProductStock productStock) {
        if(productStocks.containsKey(productStock.getStockID()))
        {
            productStocks.remove(productStock.getStockID());
            return;
        }
    };


}
