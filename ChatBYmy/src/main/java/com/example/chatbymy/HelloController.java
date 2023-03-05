package com.example.chatbymy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea servermessage;

    @FXML
    protected void onHelloButtonClick() throws Exception{
        try {
            ServerSocket ss = new ServerSocket(20);
            System.out.println("Waitings...");
            Socket s= ss.accept();
            System.out.println(s);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop")){
                str=din.readUTF();
                System.out.println("client says: "+str);
                welcomeText.setText("client says: "+str);
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            s.close();
            ss.close();




        }
        catch(Exception e){
            System.out.println(e);
        }



    }




}