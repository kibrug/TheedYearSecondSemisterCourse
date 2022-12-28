
import java.io.IOException;
import java.net.*;

public class SarverSocetProject  {



    public  static void main(String[] args) throws Exception{




        ServerSocket servSocket = null;
        Socket socket = null;

        try {
                servSocket = new ServerSocket(21);



                System.out.println("Connection start....");
            } catch (IOException e) {
                System.out.println("Could not listen on port: 4444");
                System.exit(-1);
            }

            //Second Socet programing
        try{
           socket=servSocket.accept();


        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("No Connection on port 21");
            System.exit(-1);
        }




    }
}
