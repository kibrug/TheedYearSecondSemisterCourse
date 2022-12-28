import java.net.*;

public class SarverProject {


    public  static  void main(String[] args) throws Exception{

        System.out.println("Server Programing");
        try {
            ServerSocket sc = new ServerSocket(499);
            System.out.println("Connection Established... and Wating To Cliant.....");
            sc.accept();
            //System.out.println("Connection Established... and Wating To Cliant..");
            System.out.println(sc);


        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }


}
