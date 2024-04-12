package com.inventorymanagement.productmanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;
import com.inventorymanagement.productmanagement.Product;

public class FoodGrainProduct extends Product {

    public FoodGrainProduct(int productID,Brand brand)
    {
        super(productID);
        this.brand = brand;
        this.productCategory = ProductCategory.FOODGRAINS;
    }
}
