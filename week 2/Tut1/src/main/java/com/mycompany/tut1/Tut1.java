/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tut1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Senuka Fernando
 */
public class Tut1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        UserDataStore userDataStore = new UserDataStore(new ArrayList<>());
        List<Thread> threadList = new ArrayList<>();
        Object lock = new Object();
        boolean addMoreUsers = true;
        
        while (addMoreUsers) {            
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter user name: ");
                String name = scanner.nextLine();
                
                System.out.println("Enter user age: ");
                int age = scanner.nextInt();
                
                UserProcessor userProcessor = new UserProcessor(userValidator, userDataStore, lock, name, age);
                
                Thread thread = new Thread(userProcessor);
                threadList.add(thread);
            }
            
            System.out.println("Do you want add more users? (yes/no): ");
            String response = scanner.nextLine();
            
            addMoreUsers = response.equalsIgnoreCase("yes");
        }
        
        for (Thread t : threadList) {
            try {
                t.start();
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread execution was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }            
        }
        
        System.out.println("\nAll stored users.");
        for (User user : userDataStore.getAllUsers()) {
            System.out.println(user);
        }
    }
}
