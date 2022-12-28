
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ServerSocteConnectionProject {

    public static void main(String[] args) throws Exception{

        ServerSocket server = null;
        Scanner por = new Scanner(System.in);
        System.out.println("You take same rest now "+por);

        try {

            server = new ServerSocket(34);
            //work with the server socket
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException ex) {
                    //ignore
                    System.out.println(ex);
                }
            }
        }


    }
}
