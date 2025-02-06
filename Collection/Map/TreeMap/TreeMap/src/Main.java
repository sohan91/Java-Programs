import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> emp = new TreeMap<>();
        emp.put(101,"Rajesh");
        emp.put(1010,"Sohan");
        emp.put(102,"Chandrakala");
        emp.put(104,"Rani");
        System.out.println(emp);
        emp.forEach((k,v)->System.out.println("Key : "+k+", Value : "+v));
       System.out.println("_".repeat(30));
       emp.remove(1010);
       emp.forEach((key,Value)->System.out.println("Key : "+key+", Value : "+Value));
       System.out.println("Hash code is : "+emp.hashCode());
       System.out.println("_".repeat(30));
       System.out.println("New Object");
       Map<String,Integer> maps = new TreeMap<>();
       maps.put("Raju",20);
       maps.put("Manu",30);
       maps.put("Mani",344);
       maps.put("Sohan",23);
       System.out.println(maps);
       maps.forEach((k,v)->System.out.println("Key : "+k+", Value : "+v));
       System.out.println("is map ans emp objects are same : "+maps.equals(emp));
       System.out.println("Hash Code for Map Object is "+maps.hashCode());

        System.out.println("_".repeat(30));
        System.out.println("New Object");
        Map<String,Integer> samemaps = new TreeMap<>();
        samemaps.put("Raju",20);
        samemaps.put("Manu",30);
        samemaps.put("Mani",344);
        samemaps.put("Sohan",23);
        System.out.println(samemaps);
        samemaps.forEach((K,V)->System.out.println("Key : "+K+", Value : "+V));
        System.out.println("Hash code is : "+samemaps.hashCode());
        System.out.println("is maps is equals to samemaps : "+samemaps.equals(maps));

        System.out.println("_".repeat(30));
        System.out.println("LinkedHashMap ");
        Map<String,Integer> linked  = new LinkedHashMap<>();
        linked.put("Raju",20);
        linked.put("Manu",30);
        linked.put("Mani",344);
        linked.put("Sohan",23);
        System.out.println(linked);
        linked.forEach((k,v)->System.out.println("Key : "+k+"Value : "+v));
        System.out.println("is linked is Equal to samemaps : "+linked.equals(samemaps));
        System.out.println("Hash code is : "+linked.hashCode());
    }
}
