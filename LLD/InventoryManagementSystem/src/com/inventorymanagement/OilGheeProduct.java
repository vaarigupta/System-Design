package com.inventorymanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;

public class OilGheeProduct extends Product{

    public OilGheeProduct(int productID, Brand brand) {
        super(productID);
        this.brand = brand;
        this.productCategory = ProductCategory.OIL_GHEE;
    }
}
