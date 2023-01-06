import java.io.IOException;
import java.net.*;


public class ClientConnection {

    public  static void main(String[] args){

        try {
            System.out.println("Connection Waiting.....");
            Socket ss = new Socket("172.22.48.1", 21);
            System.out.println("send and receive data...");
            System.out.println("Connection Starting.....");
            // send and receive data...
        } catch (UnknownHostException ex) {
            System.err.println(ex);
            System.out.println("Unkown Expetion Happen");
        } catch (IOException ex) {
            System.err.println(ex);
            System.out.println("IO Expetion Happen");

        }

    }
}
