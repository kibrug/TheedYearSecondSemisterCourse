import java.io.*;

public class BufferedReaderDemo {

    public static void main(String args[]) {

        //File reader

        try{

            String source = "Now is the time for all good men\n"
                    + " to come to the aid of their country\n"
                    + " and pay their due taxes.";
            FileWriter ff = new FileWriter("E:\\Filecount\\kibru.txt");
            BufferedWriter bw = new BufferedWriter(ff);
            bw.write(source);
            System.out.println("Writen file is "+bw);
            ff.close();


        }
        catch (Exception e){
            System.out.println(e);
        }
        try {


            int count =0 ;
            BufferedReader in = new BufferedReader(new FileReader("E:\\Filecount\\kibru.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            in.close();
            System.out.println("No of read iterations: " + count);
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }

}
