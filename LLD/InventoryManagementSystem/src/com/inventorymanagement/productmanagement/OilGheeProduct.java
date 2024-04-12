package com.inventorymanagement.productmanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;
import com.inventorymanagement.productmanagement.Product;

public class OilGheeProduct extends Product {

    public OilGheeProduct(int productID, Brand brand) {
        super(productID);
        this.brand = brand;
        this.productCategory = ProductCategory.OIL_GHEE;
    }
}
