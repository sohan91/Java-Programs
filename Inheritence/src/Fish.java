public class Fish extends Animal{
    private int fins;
    private int gills;
//   public Fish(String name,String type,String speed,double weight)
//   {
//   this(String name, String type, String speed, double weight);
//   }
    public Fish(String name, String type, String speed, double weight, int fins, int gills) {
        super(name, type, "fast", weight);
        this.fins = fins;
        this.gills = gills;
    }
    @Override
    public void aboutSpeed(String speed) {
        super.aboutSpeed(speed);
        if(speed == "faster")
        {
            moveBackFins();
        }
        moveMuscle();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    public void moveMuscle()
    {

        System.out.println("Muscle is Moving ");
    }

    public void moveBackFins()
    {
        System.out.println("Back Fins is Moving");
    }
}
