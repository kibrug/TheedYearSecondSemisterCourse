package com.example.lastchatapp;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Hiapp extends Application {





    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


            try {
                ServerSocket serverSocket = new ServerSocket(8000);
                jta.append("Server started at " + new Date() + '\n');
                while (true) {
                    Socket socket = serverSocket.accept();
                    DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
                    DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
                    //receive radius from the client
                    double radius = inputFromClient.readDouble();
                    double area = radius * radius * Math.PI;
                    //send area back to the client
                    outputToClient.writeDouble(area);
                    jit.append("Radius received from client: " + radius + '\n');
                    jta.append("Area computed: " + area + '\n');
                }
            } catch (IOException ex) {  System.err.println(ex);  }
        }}


}
}
