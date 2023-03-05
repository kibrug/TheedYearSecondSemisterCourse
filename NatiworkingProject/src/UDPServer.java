import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class UDPServer {




    public static void main(String[] args) throws Exception {

        DatagramSocket sock = null;
        Scanner sc = new Scanner(System.in);
        try {
            sock = new DatagramSocket(7777);
            //buffer to receive incoming data
            byte[] buffer = new byte[8192];
            DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
            System.out.println("Server socket created. Waiting for incoming data...");
            //communication loop
            while (true) {
                sock.receive(incoming);
                byte[] data = incoming.getData();
                String str = new String(data, 0, incoming.getLength());
                System.out.println("Client: " + str);
                System.out.print("Server: ");
                String msg = sc.nextLine();
                DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
                        incoming.getAddress(),  incoming.getPort());
                sock.send(dp);
            }
        } catch (
                IOException e) {
            System.err.println("IOException " + e);
        }

    }

}
