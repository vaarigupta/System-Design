package com.inventorymanagement.productmanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;

public class Product {
    int productID;
    String productName;
    ProductCategory productCategory;
    Brand brand;
    float price;

    public Product(int productID)
    {
        this.productID = productID;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
