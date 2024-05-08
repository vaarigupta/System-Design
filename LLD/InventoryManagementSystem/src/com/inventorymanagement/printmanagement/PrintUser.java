package com.inventorymanagement.printmanagement;

import com.inventorymanagement.usermanagement.User;

public class PrintUser implements  Print{


    User user;

    public  PrintUser(User user)
    {
        this.user = user;
    }

    @Override
    public void print() {
        System.out.println(user.getUserID() + ", name: " + user.getName() );
    }
}
