import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
       int input =  getArraySize();
        System.out.println("The size of an array is "+input);
        int array[] = getElements(input);

        System.out.println("Entered elements is "+Arrays.toString(array));
        int maxValue = getMaxValue(array);
        System.out.println("Max Value is "+maxValue);
    }
    private static int getArraySize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of an array ");
        int input = sc.nextInt();
        return input;
    }
    private static  int[] getElements(int input)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[input];
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter "+ i +" element ");
            int num = sc.nextInt();
            array[i]=num;
        }
        return  array;
    }
    private static int getMaxValue(int[] array)
    {
        int minValue = Integer.MIN_VALUE;
        int maxValue = 0;
        for(int i=0;i<array.length;i++)
        {
            if(minValue<array[i])
            {
                minValue = array[i];
                maxValue = minValue;
            }
        }
        return maxValue;
    }
}
