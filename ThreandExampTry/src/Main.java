import java.util.Scanner;

public class Main extends Thread {

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thread Running...");
        System.out.println("Enter your age");
        String age = sc.nextLine();
        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Name is "+name);

        System.out.println("Age is "+age);

    }
    public static void main(String[] args) {

        Main mn =new Main();
        Main mn1 =new Main();
        mn.start();
        mn1.start();
       System.out.println( mn.getPriority());
        System.out.println( mn1.getPriority());






        System.out.println("Hello world!");
    }
}