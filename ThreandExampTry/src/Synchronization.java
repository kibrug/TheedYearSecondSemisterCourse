public class Synchronization extends Thread {


    static int count = 0;
    public void run() {
        for (int x = 0; x < 10000; x++) {
            count++;
            count--;
        }
        System.out.println(" Synchronization");
        System.out.println(this.getName() + " count: " + count);
    }
    public static void main(String[] args) throws InterruptedException {
        Synchronization t1 = new Synchronization();
        Synchronization t2 = new Synchronization();
        t1.start();
        t2.start();
    }

}
