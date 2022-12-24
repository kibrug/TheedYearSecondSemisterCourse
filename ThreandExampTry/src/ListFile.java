import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ListFile {


    public static void main(String[] args) throws Exception{

/*
        File dir = new File("E:\\Filecount");
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();

            for (File f : files)
                System.out.println(f.getName());
        }

 */
        String allname = "hhdhfdjfjd cdjsfeuuuerfieokh csdjcjfjf";
        File fl = new File("E:\\Filecount\\kibru.txt");
        FileOutputStream fo =new FileOutputStream("E:\\Filecount\\kibru.txt");
        BufferedOutputStream bo =new BufferedOutputStream(fo);
        byte by[] = allname.getBytes();
        if(by.length> 0){
            fo.write(by);
            fo.close();
        }


        long len = fl.length();
        FileInputStream ff = new FileInputStream("E:\\Filecount\\kibru.txt");
        byte buffer[] = new byte[(int)len];
        //read the whole file at once
        ff.read(buffer, 0, (int) len);
        String cont = new String(buffer, "utf-8");
        System.out.println("length of "+cont.length());
        System.out.println(cont);
        /*
        int c;
        if((c=fl.read()!=-1)){
            System.out.println((char)c);

        }
        if(fl.exists()){
            System.out.println("File Exite");


        }
        else{
            fl.createNewFile();
            System.out.println("File is Created"+fl.getName());
        }
        System.out.println("File List");
        System.out.println("is exists"+fl.exists());
        System.out.println("is File"+fl.isFile());
        System.out.println("sDirectory"+fl.isDirectory());
        System.out.println("FreeSpace"+fl.getFreeSpace());
        System.out.println("AbsoluteFile"+fl.getAbsoluteFile());
        System.out.println("part"+fl.getParentFile());
        System.out.println("path"+fl.getPath());

         */

    }
}
