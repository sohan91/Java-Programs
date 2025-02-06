public class Bird implements FlightEnable,Trackable{

    public  void fly()
    {
        System.out.println(getClass().getName()+" is Flying");
    }
    public void land()
    {
        System.out.println(getClass().getName()+" is Landing");
    }
    public void takeOf()
    {
        System.out.println(getClass().getName()+" is Taking Off");
    }
    public void track()
    {
       System.out.println(getClass().getName()+"'s coordinates recorded");
    }

}
