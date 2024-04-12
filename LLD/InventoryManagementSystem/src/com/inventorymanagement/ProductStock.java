package com.inventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class ProductStock {

    int stockID;
    int productCount;
    Product product;

    public ProductStock(int stockID, Product product, int productCount)
    {
        this.stockID = stockID;
        this.product = product;
        this.productCount = productCount;
    }
    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void AddProduct(int count){

        productCount += count;
    }

    public void RemoveProduct(int count){

        if(count<=productCount)
        {
            productCount = productCount - count;
        }
    }


}
