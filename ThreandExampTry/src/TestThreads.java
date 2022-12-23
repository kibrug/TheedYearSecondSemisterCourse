public class TestThreads extends Thread {


    String name;

    TestThreads(String nm) {
        name = nm;
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread" + name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread " + name + ".");
    }

    public static void main(String args[]) {

        Thread tt1 =new Thread(new TestThreads("1"));

        tt1.start();

        try {
            ((Thread) tt1).join();
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
        Thread tt2 = new Thread(new TestThreads("2"));
        tt2.start();
        for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Main thread exiting.");

    }

}






