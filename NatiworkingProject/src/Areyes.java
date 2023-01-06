
import java.lang.*;
import java.util.*;
import java.io.*;
public class Areyes {



    public static void main(String[] args){
        //int list[] = new int[10];
        //Stack<Integer> list;

        Stack<Integer> list = new Stack<Integer>();
        //int sum=0;
        for(int i=0;i<=20;i++){
            if(i%2==0){
                list.push(i);
               // sum =sum + i;

            }

            else{break;
                //System.out.println("Not even");

            }

        }
        System.out.println("uuu"+list.capacity());
       // System.out.println("Totall"+sum);

    }
}
