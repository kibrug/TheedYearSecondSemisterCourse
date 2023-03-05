package com.example.lastchatapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
/*

public class Main extends Application {

    Stage window;
    int port;

    @Override
    public void start(Stage primaryStage) {

        port = Integer.parseInt(super.getParameters().getRaw().get(0));
        //Window
        this.window = primaryStage;
        this.window.setTitle("Server");

        //Grid
        GridPane grid = new GridPane();
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        //Scene
        Scene scene = new Scene(grid, 1080, 720);
        scene.getStylesheets().add("css/main.css");

        //Server Stuff
        new Server(port, grid);

        //Finish Window
        this.window.setScene(scene);
        this.window.show();
    }

    public static class Server {

        //Socket
        private Socket socket = null;
        private ServerSocket server = null;
        //Network Communication
        // private final ArrayList<HandleClient> CLIENTS = new ArrayList<>();
        private final LinkedBlockingQueue<String> messages;

        //UI
        private final ListView<String> CLIENTS_LIST_VIEW = new ListView<>();
        private final TextArea CHAT = new TextArea();
        ArrayList<String> clientColors = new ArrayList<String>();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        public Server(int port, GridPane grid) {
            this.messages = new LinkedBlockingQueue<>();

            //Customize CLIENTS_LIST_VIEW
            // customizeClientsListView();
            clientColors.add("#FCBA03");
            clientColors.add("#03FCBA");
            clientColors.add("#BA03FC");
            clientColors.add("#FC03C1");
            clientColors.add("#03FC3D");
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

 */

