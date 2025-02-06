import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("sohan");
        names.add("Mani");
        names.add("Raju");
        names.add("Sunny");
        names.add("sohan");
        System.out.println(names);
        System.out.println(names.size());
        Iterator it = names.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(names.remove("sohan")+" has been removed");
        System.out.println(names.contains("sohan")+" is contain");
        System.out.println(names.getClass().getName());
        System.out.println("size is "+names.size());

        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(4);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(6);
        System.out.println(numberList);

        HashSet<Integer> numberToSet = new HashSet<>();
        numberToSet.addAll(numberList);
        System.out.println(numberToSet);
        for(int num : numberToSet)
        {
            System.out.println(num);
        }
    }
}
