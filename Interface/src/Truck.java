public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getName()+" coordinate the recorded");
    }
}
