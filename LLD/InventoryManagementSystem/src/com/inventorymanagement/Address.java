package com.inventorymanagement;

import com.inventorymanagement.enums.City;
import com.inventorymanagement.enums.State;

public class Address {

    int pincode;
    State state;
    City city;
    String mainAddress;

    public Address(int pincode) {
        this.pincode = pincode;
    }

    public Address(int pincode, State state) {
        this.pincode = pincode;
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }
}
