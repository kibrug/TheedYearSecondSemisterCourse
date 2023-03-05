import java.io.*;
import java.net.*;
import java.util.*;

public class UDPCLient {





    public static void main(String[] args) throws Exception{


        DatagramSocket sock = null;
        String str;
        Scanner sc = new Scanner(System.in);
        try {
            sock = new DatagramSocket();
            InetAddress host = InetAddress.getByName("localhost");
            int port = 7777;
            while (true) {
                System.out.print("Client: ");
                str = sc.nextLine();
                byte[] b = str.getBytes();
                DatagramPacket dp = new DatagramPacket(b, b.length, host, port);
                sock.send(dp);
                //now receive reply
                byte[] buffer = new byte[8192];
                DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
                sock.receive(reply);
                byte[] data = reply.getData();
                String msg = new String(data, 0, reply.getLength());
                System.out.println("Server: " + msg);
            }
        } catch (IOException e) {  System.err.println("IOException " + e);   }

    }
}
