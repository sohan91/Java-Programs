import java.util.ArrayList;

public class Mian {
    String name;
    String marks;
    public static void main(String[] args) {
        String[] name = {"Sohan", "Mani", "Harsh", "Kiran", "Balu"};
        int[] marks = new int[5];
        marks[0] = 89;
        marks[1] = 80;
        marks[2] = 100;
        marks[3] = 90;
        marks[4] = 100;
        int i;
        int sum=0;
        for (i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
            sum+=marks[i];
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average of marks is :"+sum/marks.length);
        for (String j : name) {
            System.out.println(j);

        }
    }
}
