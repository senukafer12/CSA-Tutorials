/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut1;

/**
 *
 * @author Senuka Fernando
 */
    public class UserProcessor implements Runnable{
        private UserValidator validator;
        private UserDataStore dataStore;
        private Object lock;
        private String name;
        private int age;

        public UserProcessor(UserValidator validator, UserDataStore dataStore, Object lock, String name, int age) {
            this.validator = validator;
            this.dataStore = dataStore;
            this.lock = lock;
            this.name = name;
            this.age = age;
        }


        @Override
        public void run() {
            synchronized (lock) {
                if (validator.isValidAge(age)) {
                    // Process the user input (eg, store in the data store)
                    dataStore.addUser(new User(name, age));
                } else {
                    // Display error message for invalid input
                    System.out.println("Invalid age for User " + name);
                }
            }
        }
    }
