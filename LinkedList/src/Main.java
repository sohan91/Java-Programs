import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Sohan");
        list.add("Mani");
        System.out.println("First : "+list.getFirst());
        System.out.println("Last : "+list.getLast());
        printMoreValues(list);
        System.out.println("List is "+list);
        removingElement(list);
        System.out.println(list);
    }
    public static  void printMoreValues(LinkedList<String> list)
    {
        list.add("Latha");
        list.add("Srinu");
        list.offer("Mani teja");
        list.offerFirst("Prasad");
        list.offerLast("Latha");
    }
    public static void removingElement(LinkedList<String> list)
    {
        String rem = list.remove();//removing the first element
        System.out.println(rem+ " is removed ");
        String rem2 = list.remove(2);
        System.out.println(rem2+" is removed ");
        String rem3 = list.removeFirst();
        System.out.println("First inex of "+rem3+" is removed ");
        String rem4 = list.removeLast();
        System.out.println("Last inex of "+rem4+" is removed ");
         if(list.contains("Mani")) {
         System.out.println("Mani is already exist");
         }

    }
}
