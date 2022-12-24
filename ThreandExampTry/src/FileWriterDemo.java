import java.io.FileWriter;

public class FileWriterDemo {


    public static void main(String args[]) throws Exception {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        FileWriter f0 = new FileWriter("E:\\Filecount\\kibru.txt");
        f0.write(source);
        System.out.println("file"+f0);
        f0.close();
        //convert string to char array
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        System.out.println("file"+buffer);
        //write whole char array
        FileWriter f1 = new FileWriter("E:\\Filecount\\kibru.txt");
        f1.write(buffer);
        System.out.println("file"+f1);
        f1.close();

        //write only part of the char array
        FileWriter f2 = new FileWriter("E:\\Filecount\\kibru.txt");
        f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        System.out.println("file"+f2);
        f2.close();
    }

}
