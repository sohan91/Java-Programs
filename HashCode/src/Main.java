import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Sohan";
        String name1 = "Sohan";
        String name2 = "Soh"+"an";
        String name3 = "Soh".concat("an");
        String name4 = String.join("h","So","an");
        String name5 = "sohan";
        List<String> names = Arrays.asList(name,name1,name2,name3,name4,name5);
        names.forEach(s->System.out.println(s+" : "+s.hashCode()));
    }
}
