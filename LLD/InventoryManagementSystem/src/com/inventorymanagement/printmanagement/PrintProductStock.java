package com.inventorymanagement.printmanagement;

import com.inventorymanagement.productmanagement.Product;
import com.inventorymanagement.productmanagement.ProductStock;

public class PrintProductStock implements  Print{


    ProductStock productStock;
    PrintProduct printProduct;
    public  PrintProductStock(ProductStock productStock)
    {
        printProduct = new PrintProduct(productStock.getProduct());
        this.productStock = productStock;
    }
    @Override
    public void print() {

        System.out.println(productStock.getStockID());
        printProduct.print();
        System.out.println( ", count: " + productStock.getProductCount());

    }
}
