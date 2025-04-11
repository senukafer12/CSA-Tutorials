/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut1week1;

/**
 *
 * @author Senuka Fernando
 */
public class Sender {
    public Message createMessage(String content) {
        Message message = new Message(content);
        System.out.println("[SENDER] - Message has been created." + message.getContent());
        return message;
    }
    
    public void sendMessage(Message message, Receiver receiver) {
        System.out.println("[SENDER] - Message had being sent to receiver.");
        receiver.receiveMessage(message);
    }
}
