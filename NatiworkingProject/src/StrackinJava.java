import java.io.*;
import java.util.*;

public class StrackinJava {



    public static void main(String[] args){
        int i =0;
        Stack <String> sk = new Stack<String>();

        System.out.println("enter");
        Scanner sec = new Scanner(System.in);

        //for(int k=0; k<=10;k++){
            //sk.push();

       // }
        sk.push("kibru");
        sk.push("Hello");
        sk.push("My Name");
        sk.push("Let Suport");
        sk.push("Good Fine");
        sk.push("OOOO");

        System.out.println(sk);
        System.out.println(sk.get(4));

    }
}
