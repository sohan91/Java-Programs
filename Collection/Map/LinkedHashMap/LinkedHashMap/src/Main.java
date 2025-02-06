import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> attendence = new LinkedHashMap<>();
        LinkedHashMap<Date,Integer> maps = new LinkedHashMap<>();
        System.out.println("-".repeat(50));
        System.out.println("Attendence".toUpperCase());
        System.out.println("-".repeat(50));
        attendence.put(1,30);
        attendence.put(2,88);
        attendence.put(8,100);
        attendence.put(5,90);
        attendence.put(21,21);
        System.out.println(attendence);
        System.out.println("is contain key 4"+attendence.containsKey(4));

        System.out.println("-".repeat(50));
        System.out.println("Date with Product delivary");
        System.out.println("-".repeat(50));
       maps.put(new Date(10-2-2024),4);
        maps.put(new Date(12-2-2024),7);
        maps.put(new Date(13-2-2024),10);
        maps.put(new Date(17-02-2024),9);
        System.out.println(maps);
        int value = maps.get(new Date(10-2-2024));
        System.out.println("How many products delivered on 10-2-2024 : "+value);
        Integer vl = 0;
        for(Integer n : maps.values())
        {
            if(n>vl)
            {
                vl = n;
            }
        }
        System.out.println("on which date highest product has delivered : "+vl);
    }
}
