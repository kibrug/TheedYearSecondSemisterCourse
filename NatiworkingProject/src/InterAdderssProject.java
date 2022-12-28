import java.net.*;
import java.util.*;



public class InterAdderssProject {

    public static void main(String args[]) throws UnknownHostException {

        try {
            InetAddress address = InetAddress.getLocalHost();

            System.out.println("Current Host/LocalHost Name you Use Now Is :"+address);
            //InetAddress ia = InetAddress.getAllByName("ju.edu.et");
            address = InetAddress.getByName("ju.edu.et");
            System.out.println(address);
            InetAddress SW[] = InetAddress.getAllByName("www.kibru.com");
            for (int i=0; i<SW.length; i++)
                System.out.println(SW[i]);
        }
        catch (Exception e){
            System.out.println(e);

        }

    }



}
