import java.util.Scanner;


public class ThreadTestone extends Thread {
    static  String message;
    public void run() {
      /*  try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
            message = "Software ENG";

        }
        message= "kibru";

       */
        final String name="kibru";

            for (int i = 1; i <= 50; i++) {
                System.out.println("Child Thread" + name + ": " + i);
            }

            System.out.println("Exiting child thread " + name + ".");
        }





    public static void main(String[] args) throws Exception{
        ThreadTestone dc1 = new ThreadTestone();
        ThreadTestone dc2 = new ThreadTestone();
        dc1.setName("1");
        dc2.setName("2");
        dc1.setPriority(2);
        dc2.setPriority(9);
        dc1.start();
        System.out.println(dc1.getName());
        System.out.println(dc2.getName());

        dc2.start();


    }

}
