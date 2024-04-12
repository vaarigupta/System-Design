package com.inventorymanagement;

import com.inventorymanagement.enums.OrderStatus;
import com.inventorymanagement.enums.PaymentMode;
import com.inventorymanagement.enums.PaymentStatus;
import com.inventorymanagement.ordermanagement.Cart;
import com.inventorymanagement.ordermanagement.Invoice;
import com.inventorymanagement.ordermanagement.Order;
import com.inventorymanagement.paymentmanagement.Payment;
import com.inventorymanagement.paymentmanagement.PaymentFactory;
import com.inventorymanagement.productmanagement.ProductStock;
import com.inventorymanagement.usermanagement.User;
import com.inventorymanagement.usermanagement.UserController;
import com.inventorymanagement.warehousemanagement.Inventory;
import com.inventorymanagement.warehousemanagement.NearestWarehouseSelectionStrategy;
import com.inventorymanagement.warehousemanagement.Warehouse;
import com.inventorymanagement.warehousemanagement.WarehouseController;

import java.util.List;
import java.util.Map;

public class InventoryManagement {

    UserController userController;
    WarehouseController warehouseController;
    InventoryManagementData inventoryManagementData;

    public InventoryManagement()
    {
        warehouseController = new WarehouseController(new NearestWarehouseSelectionStrategy());
        userController = new UserController();
        inventoryManagementData = new InventoryManagementData(userController, warehouseController);
    }

    public InventoryManagementData getInventoryManagementData() {
        return inventoryManagementData;
    }

    public void setInventoryManagementData(InventoryManagementData inventoryManagementData) {
        this.inventoryManagementData = inventoryManagementData;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public WarehouseController getWarehouseController() {
        return warehouseController;
    }

    public void setWarehouseController(WarehouseController warehouseController) {
        this.warehouseController = warehouseController;
    }

    public static void main(String[] args) {

       InventoryManagement inventoryManagement = new InventoryManagement();
       InventoryManagementData inventoryManagementData = inventoryManagement.getInventoryManagementData();
       WarehouseController warehouseController = inventoryManagement.getWarehouseController();
       UserController userController = inventoryManagement.getUserController();

        List<User> userList =  inventoryManagementData.CreateUser();

        List<Address> addressList = inventoryManagementData.CreateAddresses();

       warehouseController.setWarehouseList(inventoryManagementData.CreateWarehouse());

        User user = userList.get(0);

        //add delivery address
        user.setSelectedDeliveryAddress(addressList.get(0));

        //get delivery address
        Address deliveryAddress = user.getSelectedDeliveryAddress();
        //add address to the user's address list
        user.AddAdress(deliveryAddress);

        //add to cart
        Cart cart = new Cart();
        cart.AddItemToCart(1,2);
        cart.AddItemToCart(2,3);

        //set cart to the user
        user.setCart(cart);

        Warehouse warehouse = warehouseController.FindWareHouse(deliveryAddress);

        //place order
        Order order =  inventoryManagement.CreateOrder(user,deliveryAddress,warehouse,PaymentMode.CASH_ON_DELIVERY);

        System.out.println("Finally 1 order fulfilled");
    }

    public Order CreateOrder(User user, Address deliveryAddress, Warehouse warehouse, PaymentMode paymentMode)
    {
        Order order = new Order(user,deliveryAddress,warehouse);
        order.setOrderID(1);
        Inventory inventory = warehouse.getInventory();
        Map<Integer, ProductStock> productStockList =  inventory.getProductStocks();

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
