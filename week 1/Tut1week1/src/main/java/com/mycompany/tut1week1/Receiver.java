/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut1week1;

/**
 *
 * @author Senuka Fernando
 */
public class Receiver {
    public void receiveMessage(Message message) {
        System.out.println("[RECEIVER] - Message has been received");
        System.out.println("[RECEIVER] - Message content: " + message.getContent());
    }
}
