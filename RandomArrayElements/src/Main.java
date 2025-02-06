import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array ");
        int len =sc.nextInt();
        int rand[] = RandomArray(len);
        System.out.println(Arrays.toString(rand));
        Arrays.sort(rand);
        System.out.println("sorted list is "+Arrays.toString(rand));

        int rand1[] = new int[len];
        System.out.println(Arrays.toString(rand1));
        Arrays.sort(rand1);
        System.out.println("Sorted is "+Arrays.toString(rand1));
        Arrays.fill(rand1,5);
        System.out.println("Sorted is "+Arrays.toString(rand1));

        int[] firstArray = Arrays.copyOf(rand,rand.length);
        System.out.println(Arrays.toString(firstArray));

    }
    public static  int[] RandomArray(int len)
    {
        Random ran = new Random();
        int arraylist[]= new int[len];
        for (int i=0;i<len;i++)
        {
            arraylist[i]= ran.nextInt(100);
        }
        return arraylist;
    }
}
