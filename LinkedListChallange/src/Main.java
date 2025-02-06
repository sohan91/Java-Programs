import java.util.LinkedList;
import java.util.TooManyListenersException;

public class Main
{
    record Place(String name,int distance)
    {
        @Override
        public String toString()
        {

            return String.format("%s (%d)",name,distance);
        }
    }
    public static void main(String[] args) {
        Place places = new Place("Hasthinapuram",3289);
        LinkedList<Place> placesToVisit = new LinkedList<>();
        addToPlaces(placesToVisit,places);
        addToPlaces(placesToVisit,new Place("Hasthinapuram",3289));
        addToPlaces(placesToVisit,new Place("B.N.Reddy",894));
        addToPlaces(placesToVisit,new Place("Medaram",4843));
        addToPlaces(placesToVisit,new Place("Warangal",154));
        addToPlaces(placesToVisit,new Place("Bengalore",500));
        addToPlaces(placesToVisit,new Place("Kerala",800));
        addToPlaces(placesToVisit,new Place("Kerala",800));
        System.out.println(placesToVisit);
    }
    public static void addToPlaces(LinkedList<Place> list,Place place)
    {
        if(list.contains(place))
        {
            System.out.println("Duplication found "+place);
            list.remove(place);
        }

        list.add(place);
    }
}
