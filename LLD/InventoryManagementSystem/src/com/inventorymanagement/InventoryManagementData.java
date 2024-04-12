package com.inventorymanagement;

import com.inventorymanagement.enums.Brand;
import com.inventorymanagement.enums.City;
import com.inventorymanagement.enums.ProductCategory;
import com.inventorymanagement.enums.State;
import com.inventorymanagement.productmanagement.Product;
import com.inventorymanagement.productmanagement.ProductFactory;
import com.inventorymanagement.productmanagement.ProductStock;
import com.inventorymanagement.usermanagement.User;
import com.inventorymanagement.usermanagement.UserController;
import com.inventorymanagement.warehousemanagement.Inventory;
import com.inventorymanagement.warehousemanagement.Warehouse;
import com.inventorymanagement.warehousemanagement.WarehouseController;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagementData {


    UserController userController;
    WarehouseController warehouseController;

    public  InventoryManagementData(UserController userController, WarehouseController warehouseController)
    {
        this.userController = userController;
        this.warehouseController = warehouseController;
    }

    public List<User> CreateUser()
    {
        for(int i=0;i<10;i++)
        {
            userController.AddUser(new User(i));
        }
        userController.getUserList().get(0).setName("Vaari");
        return  userController.getUserList();
    }

    public List<Warehouse> CreateWarehouse()
    {
        List<Address> addressList = CreateAddresses();

        Warehouse warehouse1 = new Warehouse();
        Inventory inventory = CreateInventory();
        warehouse1.setInventory(inventory);
        warehouse1.setWarehouseAddress(addressList.get(0));

        Warehouse warehouse2 = new Warehouse();
        warehouse2.setInventory(inventory);
        warehouse2.setWarehouseAddress(addressList.get(1));

        warehouseController.AddWarehouse(warehouse1);
        warehouseController.AddWarehouse(warehouse2);

        return warehouseController.getWarehouseList();
    }

    public Inventory CreateInventory()
    {

        List<Product> productList = CreateProduct();
        Inventory inventory = new Inventory();
        ProductStock productStock0 = new ProductStock(1, productList.get(0),3);
        ProductStock productStock1 = new ProductStock(2, productList.get(1),4);
        ProductStock productStock2 = new ProductStock(3, productList.get(2),5);


        inventory.addProductStock(productStock0);
        inventory.addProductStock(productStock1);
        inventory.addProductStock(productStock2);
        return inventory;
    }

    public  List<Product> CreateProduct()
    {
        List<Product> productList = new ArrayList<Product>();
        for(int i=0;i<5;i++)
        {
            productList.add(ProductFactory.GetProduct(i,ProductCategory.FOODGRAINS,Brand.PANSARI));
        }

        productList.get(0).setProductName("ATTA");
        productList.get(0).setPrice(50);
        productList.get(1).setProductName("MOONG DAL");
        productList.get(1).setPrice(70);
        productList.get(2).setProductName("RICE");
        productList.get(2).setPrice(100);
        productList.get(3).setProductName("CHANA DAL");
        productList.get(3).setPrice(90);
        productList.get(4).setProductName("RAJMA");
        productList.get(4).setPrice(60);

        return  productList;
    }

    public List<Address> CreateAddresses()
    {
        List<Address> addressList = new ArrayList<Address>();
        for(int i=0;i<3;i++)
        {
            addressList.add(new Address(1, State.UTTAR_PRADESH));
        }
        addressList.get(0).setCity(City.GHAZIABAD);
        addressList.get(0).setPincode(201017);
        addressList.get(1).setCity(City.NOIDA);
        addressList.get(0).setPincode(201303);
        addressList.get(2).setCity(City.KANPUR);
        addressList.get(0).setPincode(208001);
        return  addressList;
    }


}