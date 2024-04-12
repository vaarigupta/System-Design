package com.inventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class User {

    int userID;
    String name;
    List<Address> addresses;
    Cart cart;
    List<Integer> orderIDList;
    Address selectedDeliveryAddress;

    public  User(int userID)
    {
        addresses = new ArrayList<Address>();
        this.userID = userID;
    }
    public User(int userID, String name)
    {
        this.userID = userID;
        this.name = name;
        addresses = new ArrayList<Address>();
    }

    public Address getSelectedDeliveryAddress() {
        return selectedDeliveryAddress;
    }

    public void setSelectedDeliveryAddress(Address selectedDeliveryAddress) {
        this.selectedDeliveryAddress = selectedDeliveryAddress;
    }

    public void AddAdress(Address address)
    {
        addresses.add(address);
    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> getOrderIDList() {
        return orderIDList;
    }

    public void setOrderIDList(List<Integer> orderIDList) {
        this.orderIDList = orderIDList;
    }
}
