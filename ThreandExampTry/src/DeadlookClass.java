public class DeadlookClass extends Thread{
    //Deadlook
    public void run(){
        final String name = "Kibru what you Now about Deadlook in Ditele";
        final String age = "Are your age is 25";
        synchronized (name){
         try{
             System.out.println("Yoor name Deadlok is " + name);
             Thread.sleep(2000);
        }
         catch (Exception e)
         {

             System.out.println("Exeptin "+e);
         }
        }
        synchronized (age){
            try {
                System.out.println("Yoor Age Deadlok is "+age);
                Thread.sleep(2000);

            }
            catch (Exception e){
                System.out.println("ext"+e);
            }

        }


    }





    public static void main(String[] args){
        DeadlookClass dc = new DeadlookClass();
        dc.start();


    }
}
