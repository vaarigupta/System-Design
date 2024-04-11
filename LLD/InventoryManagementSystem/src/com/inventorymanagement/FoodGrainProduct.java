package com.inventorymanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;

public class FoodGrainProduct extends Product{

    public FoodGrainProduct(int productID,Brand brand)
    {
        super(productID);
        this.brand = brand;
        this.productCategory = ProductCategory.FOODGRAINS;
    }
/*    public FoodGrainProduct(int productID, ProductCategory productCategory) {
        super(productID, productCategory);
    }

    public FoodGrainProduct(int productID, ProductCategory productCategory, Brand brand) {
        super(productID, productCategory, brand);
    }

    public FoodGrainProduct(int productID, String productName, ProductCategory productCategory, Brand brand) {
        super(productID, productName, productCategory, brand);
    }*/
}
