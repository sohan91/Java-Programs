public class Dog extends  Animal{
    private  String earShape;
    private  String tailShape;


    public Dog() {

            super("Dog", "Barking", "Faster", 7845.48);

    }
 public Dog(String name,String type,double weight)
 {
     this(name,type,"Faster",weight,"Stiffy","Curved");
 }
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public Dog(String name ,String type ,String speed,double weight,String earShape, String tailShape)
    {
        super(name,type,speed,weight);
        this.earShape=earShape;
        this.tailShape=tailShape;
    }

    public void aboutType()
    {
        super.aboutType();
        System.out.println("can wag the tail and make Bow sounds !");
    }
    @Override
    public void aboutSpeed(String speed) {
        super.aboutSpeed(speed);
        if(speed == "Faster")
        {
            bark();
            run();
        }
        else {
            walk();
            wagTail();
        }
    }
    public void bark()
    {
        System.out.println("makes bark sounds");
    }
    public void run()
    {
        System.out.println("follow the humans ");
    }
    public void walk()
    {
          System.out.println("Walks ");
    }
    public void wagTail()
    {
        System.out.println("wag the tail");
    }
}
