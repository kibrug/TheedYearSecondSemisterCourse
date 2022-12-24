import java.io.*;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        File file = new File("E:\\Filecount\\kibru.txt");
        BufferedInputStream bin = null;
        try {
            FileInputStream fin = new FileInputStream(file);
            bin = new BufferedInputStream(fin);

            byte[] contents = new byte[1024];
            int bytesRead = 0;
            String content;

            while ((bytesRead = bin.read(contents)) != -1) {
                content = new String(contents, 0, bytesRead);
                System.out.print(content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println("Exception while reading the file " + e);
        }
    }

}
