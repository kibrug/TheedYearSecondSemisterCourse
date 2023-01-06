
import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class ClientOne {

    public  static  void main(String[] args) throws Exception{
        try {
            System.out.println("Connction startated");
            Socket sc = new Socket("localhost", 20);
            DataInputStream din=new DataInputStream(sc.getInputStream());
            DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop")){
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server says: "+str2);
            }

            dout.close();
            sc.close();

        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
