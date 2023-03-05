public class ProxImage implements Image{

    private RealImage realImage;
    private String filname;


   public  ProxImage(String filname){

       this.filname=filname;
   }
    @Override
    public void display() {
       if(realImage==null){
           realImage = new RealImage(filname);
       }
       realImage.display();

    }
}
