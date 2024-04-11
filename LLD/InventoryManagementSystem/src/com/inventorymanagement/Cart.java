package com.inventorymanagement;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    int cartID;
    Map<Integer, Integer>  productStockIDvsCount;
    Inventory inventory;
    public  Cart()
    {
        productStockIDvsCount = new HashMap<Integer, Integer>();
    }

    void AddItemToCart(int productStockID, int productCount)
    {
        if(productStockIDvsCount.containsKey(productStockID))
        {
            int updatedProductCount = productStockIDvsCount.get(productStockID) + productCount;
            productStockIDvsCount.put(productStockID,updatedProductCount );
        }
        else
        {
            productStockIDvsCount.put(productStockID,productCount);
        }
    }
    void RemoveItemFromCart(int productStockID, int productCount){
        if(productStockIDvsCount.containsKey(productStockID))
        {
            int updatedProductCount = productStockIDvsCount.get(productStockID) - productCount;
            productStockIDvsCount.put(productStockID,updatedProductCount);
        }
        else {
            productStockIDvsCount.put(productStockID,productCount);
        }
    }
    public  Map<Integer,Integer> GetItemsInCart(){
        return productStockIDvsCount;
    }

    public  boolean IsCartEmpty()
    {
       return productStockIDvsCount.isEmpty();
    }

    public float CalculateCartAmount(Inventory inventory)
    {
        Map<Integer,ProductStock> productStockMap =  inventory.getProductStocks();
        float totalAmount = 0;

        for(Map.Entry<Integer,Integer> entry : productStockIDvsCount.entrySet())
        {
            int id = entry.getKey();
            int count = entry.getValue();
            float costOfProduct = productStockMap.get(id).getProduct().getPrice();
            totalAmount += (costOfProduct*count);
        }
        return totalAmount;
    }
}
