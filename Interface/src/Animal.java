interface FlightEnable {
    void fly();
    void land();
    void takeOf();
}
interface Trackable{
    double kilometerInMeters = 1000;
    void track();
}
public abstract class Animal {
    abstract void move();
}
