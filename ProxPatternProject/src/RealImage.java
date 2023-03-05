public class RealImage implements Image{
    private String filname;

   public RealImage(String filname){
       this.filname=filname;
       loadFromDsk(filname);
   };

    @Override
    public void display() {
        System.out.println("displaying "+filname);

    }
    private void loadFromDsk(String filname){
        System.out.println("Loading   "+filname);
    }
}
