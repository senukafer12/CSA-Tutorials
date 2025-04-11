/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut1;

import java.util.ArrayList;

/**
 *
 * @author Senuka Fernando
 */
public class UserDataStore {
    private ArrayList<User> userList;

    public UserDataStore(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public void addUser (User user) {
        userList.add(user);
    }
    
    public ArrayList<User> getAllUsers() {
        return userList;
    }
}
