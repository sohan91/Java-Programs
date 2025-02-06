

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args)
    {
        Integer autoBoxing = 20;//autoboxing
        Integer manual = Integer.valueOf(20);//manualboxing and it is unnecessary
        int unBoxing = autoBoxing;//autoUnBoxing
        int manualUnBoxing = autoBoxing;
        System.out.println(autoBoxing.getClass().getName());
        double toPrim = returningObjectDouble();// returning wrapper->primitive type(AutoBoxing)
        Double toObj = returningPrimitiveDouble();//returning primitive->Wrapper(Unboxing)
        System.out.println(toObj.getClass().getName());
        System.out.println(toPrim);
        var number = lists(5,8,9,10,45);
        System.out.println(number);
    }
    public static double returningPrimitiveDouble()
    {
        return 100.554;
    }
    public static Integer num(int n)
    {
        System.out.println("n = "+n);
        return 0;
    }
    public static int number(Integer i)
    {
        System.out.println("i = "+i);
        return i;
    }
    public static List<Integer> lists(Integer...i)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int number : i)
        {
            myList.add(number);
        }
        return myList;
    }
    public static Double returningObjectDouble()
    {
        return Double.valueOf(194.45);
    }
}
