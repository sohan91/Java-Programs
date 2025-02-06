import java.util.Arrays;
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        int input = getArraySize();
        System.out.printf("the size of an array is %d\n",input);
        int array[] = getArrayElement(input);
        System.out.println("Array list is "+Arrays.toString(array));
        int reverse[] = reverseNumber(array);
        System.out.println("Reversed array list is "+Arrays.toString(reverse));

    }
    private  static  int getArraySize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a size an array ");
        int input = sc.nextInt();
        return input;
    }
    private static  int[] getArrayElement(int input)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[input];
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter "+i+" element ");
            int number = sc.nextInt();
            array[i]=number;
        }
        return array;
    }
    private  static  int[] reverseNumber(int[] array)
    {

        int temp[] = new int[array.length];
        for(int i=array.length-1 ; i>=0 ; i--)
        {
            temp[array.length -1- i] = array[i];
        }
        return temp;
    }
}

