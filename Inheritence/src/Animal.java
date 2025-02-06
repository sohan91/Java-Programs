public class Animal {
    private  String name;
    private String type;
    private  String speed;
    private  double weight;
    public Animal(String name,String type,String speed,double weight)
    {
        this.name=name;
        this.type=type;
        this.speed=speed;
        this.weight = weight;

    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed='" + speed + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void doSounds( )
    {
        System.out.println(name+" makes sounds different");
    }
    public void aboutWeight()
    {
        System.out.println(name+" weight is "+weight+"kg");
    }
    public void aboutSpeed(String speed)
    {
        System.out.println(name+" moves "+speed);
    }
    public void aboutType()
    {
        System.out.println(name+" is a "+type+" animal");
    }
}
