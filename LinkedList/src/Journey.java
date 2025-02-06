import java.util.LinkedList;

public class Journey {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.add("Hydrabad");
        places.add("Tirupati");
        places.add("Yadadri");
        placesToBeAdded(places);
        System.out.println(places);
        journerDetails(places);

    }
    public  static  void placesToBeAdded(LinkedList<String> list)
    {
        list.add("Nagarguna Sagar");
        list.add("Medaram");

    }
    public  static void journerDetails(LinkedList<String> lists)
    {
        System.out.println("\n  Journey starts from "+lists.getFirst());
        for(int i=1;i<lists.size();i++)
        {
            System.out.println("  -->From : "+lists.get(i-1)+" to "+lists.get(i));
        }
        System.out.println("  Hence , Journey ends in " +lists.getLast());
    }
}
