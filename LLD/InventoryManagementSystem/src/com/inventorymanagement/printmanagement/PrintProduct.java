package com.inventorymanagement.printmanagement;

import com.inventorymanagement.productmanagement.Product;

public class PrintProduct implements  Print {

    Product product;

    public PrintProduct(Product product)
    {
        this.product = product;
    }


    @Override
    public void print() {

        System.out.println(product.getProductID() +
                ", name: " + product.getProductName() +
                ", category: " + product.getProductCategory() +
                ", brand: " + product.getBrand() +
                ", price: " + product.getPrice());
    }
}
