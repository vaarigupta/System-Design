package com.inventorymanagement.productmanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.ProductCategory;

public class ProductFactory {

    public  static Product GetProduct(int productID, ProductCategory productCategory, Brand brand)
    {
        if(productCategory.equals(ProductCategory.FOODGRAINS))
        {
            return new FoodGrainProduct(productID,brand);
        }
        else if(productCategory.equals(ProductCategory.OIL_GHEE))
        {
            return  new OilGheeProduct(productID,brand);
        }
        return new Product(productID);

    }
}
