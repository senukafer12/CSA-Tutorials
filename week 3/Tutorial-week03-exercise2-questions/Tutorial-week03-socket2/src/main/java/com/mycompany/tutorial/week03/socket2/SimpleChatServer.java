/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial.week03.socket2;

//import necessary libraries
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleChatServer {
    public static void main(String[] args) {
        try {
            //Create a new instance of the Server Socket and pass port number
            ServerSocket serverSocket = new ServerSocket(5000);
            
            //print out a message to say Server is running 
            System.out.println("Server is running and waiting for a client to connect....");

            // Wait for a client to connect and accept the client request
            Socket clientSocket = serverSocket.accept();

            //print out a message to say client connected and get the IP ddress
            System.out.println("client connected: " + clientSocket.getInetAddress());

            // Input stream to receive messages from the client
            InputStream inputStream = clientSocket.getInputStream();

            // Output stream to send messages to the client
            OutputStream outputStream = clientSocket.getOutputStream();

            
            //Create a buffer array with type byte, the size must be 1024
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read messages from the client and print them
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Client: " + message);

                // Send a response back to the client
                String responseMessage = "Server received your message: " + message;
                outputStream.write(responseMessage.getBytes());
            }
            

            // Close the sockets
           clientSocket.close();
           serverSocket.close();
        }catch (IOException e) {    
        //catch IO exception
            e.printStackTrace();
        }
    }
}
