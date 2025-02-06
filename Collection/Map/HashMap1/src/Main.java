import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Sohan",23);
        map.put("Latha",90);
        map.put("Mani",23);
        map.put("Srinu",2);
        System.out.println(map);
        System.out.println("_".repeat(30));
        System.out.println("key".toUpperCase());
        System.out.println("-".repeat(30));
        for(var name : map.keySet())
        {
            System.out.println(name);
        }
        map.forEach((k,v)->System.out.println(" "+k+"  "+v));//
        System.out.println("-".repeat(30));
        System.out.println("Values");
        System.out.println("-".repeat(30));
        for(var values : map.values())
        {
            System.out.println(values);
        }
        System.out.println("-".repeat(30));

    }
}
