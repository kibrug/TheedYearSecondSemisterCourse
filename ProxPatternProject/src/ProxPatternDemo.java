public class ProxPatternDemo {

    public static void main(String[] args) {
        Image  im = new ProxImage("kibru.png");
        //Loading from disk
        im.display();
        System.out.println("");

        //will not loade from disk
        im.display();


    }
}
