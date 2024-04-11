package com.inventorymanagement;

import com.inventorymanagement.enums.OrderStatus;
import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.enums.PaymentStatus;

import java.util.List;
import java.util.Map;

public class InventoryManagement {

/*
    UserController userController;
    WarehouseController warehouseController;
    InventoryManagementData inventoryManagementData;
    public InventoryManagement()
    {
        inventoryManagementData = new InventoryManagementData(new UserController(), new WarehouseController());
    }
*/


    public static void main(String[] args) {

        InventoryManagement inventoryManagement = new InventoryManagement();
        WarehouseController warehouseController = new WarehouseController(new NearestWarehouseSelectionStrategy());
        UserController userController = new UserController();
        InventoryManagementData inventoryManagementData = new InventoryManagementData(userController, warehouseController);


        List<User> userList =  inventoryManagementData.CreateUser();

        List<Address> addressList = inventoryManagementData.CreateAddresses();
        List<Product> productList = inventoryManagementData.CreateProduct();

        Inventory inventory = inventoryManagementData.CreateInventory();

        List<Warehouse> warehouseList = inventoryManagementData.CreateWarehouse();

        User user = userList.get(0);
        user.AddAdress(addressList.get(0));
        user.setSelectedDeliveryAddress(addressList.get(0));
        //add to cart
        Cart cart = new Cart();
        cart.AddItemToCart(0,2);
        cart.AddItemToCart(1,3);

        user.setCart(cart);

        Address deliveryAddress = user.getSelectedDeliveryAddress();
        Warehouse warehouse = warehouseController.FindWareHouse(deliveryAddress);

        //place order
        Order order =  inventoryManagement.CreateOrder(user,deliveryAddress,warehouse,PaymentMode.CASH_ON_DELIVERY);


    }

    public Order CreateOrder(User user, Address deliveryAddress, Warehouse warehouse, PaymentMode paymentMode)
    {
        Order order = new Order(user,deliveryAddress,warehouse);
        order.setOrderID(1);
        Inventory inventory = warehouse.getInventory();
        Map<Integer,ProductStock> productStockList =  inventory.getProductStocks();

        Cart cart = user.getCart();
        Map<Integer,Integer> productStockIDvsCount = cart.GetItemsInCart();

        order.setProductStockIDvsCount(productStockIDvsCount);
        //Reduce items from inventory /update inventory
        for (Map.Entry<Integer,Integer> entry : productStockIDvsCount.entrySet())
        {
            int stockID = entry.getKey();
            int productCount = entry.getValue();

            if(productStockList.containsKey(stockID))
            {
                ProductStock productStock = productStockList.get(stockID); //get productStock using stockID
                productStock.RemoveProduct(productCount); // reduce the number of items in productStock
                productStockList.put(stockID,productStock); //update productStockList
            }

        }
        inventory.setProductStocks(productStockList);

        float orderAmount = cart.CalculateCartAmount(inventory);

        Payment payment =  PaymentFactory.GetPaymentMethod(paymentMode,orderAmount);
        if(payment.Pay())
        {
            payment.setPaymentStatus(PaymentStatus.SUCCESS);
            System.out.println("Success! Order Placed");
        }
        else
        {
            System.out.println("Sorry! not successful");
        }

        order.setPayment(payment);

        order.setOrderStatus(OrderStatus.DELIVERED);

        Invoice invoice = new Invoice(order.getOrderID(), user,deliveryAddress,productStockIDvsCount,orderAmount);
        order.setInvoice(invoice);
        return order;

    }
}
