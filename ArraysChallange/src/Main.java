import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an array ");
        int len = sc.nextInt();
        int list1[] = generateRandomArray(len);
        System.out.println(Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println("After Sorting in asc "+Arrays.toString(list1));
        int[] setarray =  descendingOrderList(new int[]{90,2,31,7,52,82,524});
        System.out.println("Descending oreder list is "+Arrays.toString(setarray));

    }
    public static int[] generateRandomArray(int len)
    {
        Random rd = new Random();
        int[] array = new int[len];
        for(int i =0;i<len;i++)
        {
            array[i] = rd.nextInt(100);
        }

        return array;
    }
    public static  int[] descendingOrderList(int[] array)
    {
       System.out.println(Arrays.toString(array));
                int []d = Arrays.copyOf(array,array.length);
        int temp;
        boolean  flag = true;
        while(flag)
        {
            flag=false;
            for(int i=0;i<d.length-1;i++) {
                if (d[i] < d[i + 1]) {
                    temp = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = temp;
                    flag = true;
                    System.out.println("---"+Arrays.toString(d));
                }

            }
        }
        return  d;
    }
    
}
