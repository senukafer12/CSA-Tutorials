/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut1week1;

/**
 *
 * @author Senuka Fernando
 */
public class MessagePassingExample {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        
        Message message = sender.createMessage("Hello Receiver, from the Sender.");
        sender.sendMessage(message, receiver);
    }
}
