import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {



    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        try {
            int c;
            inputStream = new FileReader("E:\\Filecount\\kibru.txt");
            while ((c = inputStream.read()) != -1) {
                System.out.print("File connent :\n "+(char) c);
            }
        } finally {
            if (inputStream != null)
                inputStream.close();
        }
    }

}
