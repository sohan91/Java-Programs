import java.util.HashSet;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        number.add(4);
        number.add(3);
        number.add(0);
        number.add(100);
        number.add(3);
        System.out.println(number);

        for(Integer i : number)
        {
            System.out.println(i);
        }
        HashSet<Integer> num = new HashSet<>(4);
        num.add(442);
        num.add(422);
        num.add(02);
        num.add(599);
        System.out.println("before Sorting : "+num);
        number.addAll(num);
        System.out.println("After Sorting : "+number);
    }
}