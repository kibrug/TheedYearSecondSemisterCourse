import java.io.*;

public class BufferedStreamDemo {


    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("E:\\Filecount\\kibru.txt");
            FileOutputStream outputStream = new FileOutputStream("E:\\Filecount\\kibru.pdf");
            // Enveloping byte Streams into buffered streams
            BufferedInputStream bufferIn = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferOut = new BufferedOutputStream(outputStream);

            // this array stores the data read in the form of bytes.
            byte[] buffer = new byte[1024];
            while (bufferIn.read(buffer) != -1) {
                bufferOut.write(buffer); //this writes to output buffer, not directly to file
                System.out.println("output"+bufferIn.read());
            }
            System.out.println("File copied successfully");
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file is not found");
        } catch (IOException e) {
            System.out.println("Error in Reading and writing operations");
        }
    }

}
