
import java.util.*;
import java.lang.*;
public class DataTypes {


    public int intgerDatatype(){
        try {
            Scanner d = new Scanner(System.in);

            int dk=90;
            //double db = double(d);
            System.out.println("Intger Data Type" + dk);;


        }
        catch (Exception e){
            System.out.println(e);
        }


       return 0;
    }
    public String stringDatatype(){
        String k = "kibru";
        try {
            Scanner s = new Scanner(System.in);

            //double st = (d);
            System.out.println("Strings Data Type"+ k);


        }
        catch (Exception e){
            System.out.println(e);
        }

        return  k;

    }
    public float floatDatatype(){
        try {
            Scanner ft = new Scanner(System.in);

            float f = 5;
            //double ft = double(d);
            System.out.println("Float Data Type" + f);


        }
        catch (Exception e){
            System.out.println(e);
        }


        return 0;
    }

    public float doubleDatatype(){
        try {
            Scanner d = new Scanner(System.in);

            double sd = 45.67;

            //double db = double(d);
            System.out.println("Doable Data Type"+ sd);


        }
        catch (Exception e){
            System.out.println(e);
        }

        return 0;
    }




    public static  void  main(String[] args){

        System.out.println("Welcome Main Data Type Programming");
        DataTypes dt = new DataTypes();
        dt.doubleDatatype();
        dt.floatDatatype();
        dt.intgerDatatype();
        dt.stringDatatype();
        Scanner sc = new Scanner(System.in);
        sc.hasNextByte();
        System.out.println(sc.hasNextByte());
        System.out.println(sc.hasNext());
        System.out.println(sc.hasNextBoolean());
        System.out.println(sc.next());






    }
}
