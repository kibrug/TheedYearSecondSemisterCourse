import java.util.Scanner;


public class ThreadTestone extends Thread {
    static  String message;
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
            message = "Software ENG";

        }
        message= "kibru";


    }

    public static void main(String[] args) throws Exception{
        ThreadTestone dc = new ThreadTestone();
        dc.start();
        message ="Socal eng";
         Thread.sleep(2000);

        System.out.println(message);


    }

}
