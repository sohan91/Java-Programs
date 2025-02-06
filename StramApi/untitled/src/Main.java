import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(43);
        nums.add(100);
        nums.add(1);
        System.out.println(nums);
        nums.forEach(s->System.out.println(s));
        Stream<Integer> data = nums.stream();
        System.out.println("_".repeat(30));
        System.out.println("Operation Data : ");
        Stream<Integer> mapedData = data.map(n->n*2);
//        data.forEach(s->System.out.println(s*2));
       mapedData.forEach(s->System.out.println(s));
    }
}
