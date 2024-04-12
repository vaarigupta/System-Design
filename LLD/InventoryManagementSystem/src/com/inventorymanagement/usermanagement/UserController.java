package com.inventorymanagement.usermanagement;


import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> userList;

    public  UserController()
    {
        userList = new ArrayList<User>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void AddUser(User user){
        userList.add(user);
    }
    void RemoveUser(User user) {
        if(userList.contains(user))
            userList.remove(user);
    }
}
