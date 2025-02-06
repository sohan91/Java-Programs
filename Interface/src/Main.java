import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
            Jet j = new Jet();
            Animal animal = j;
            FlightEnable fe = j;
            Trackable t = j;
            fe.takeOf();
            fe.fly();
            t.track();
            fe.land();
            double kiloMetersTravalled = 200;
        Truck truck = new Truck();
        truck.track();
            System.out.println("The distance trvelled by a truck is "+kiloMetersTravalled * Trackable.kilometerInMeters+"m or " );
            var date = new Date();
            System.out.println(date);

    }
}
