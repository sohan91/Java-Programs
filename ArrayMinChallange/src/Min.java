import java.util.Scanner;

public class Min
{
    public static void main(String[] args) {
        int userInput =needArraySize();
        System.out.printf("Array size is %d\n",userInput);
        int array[] = getElements(userInput);
        int minValue = getMinNumber(array);
        System.out.println("Min value  is "+minValue);

    }
    public static  int needArraySize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array ");
        int input = sc.nextInt();
        return input;
    }
    public static  int[] getElements(int input)
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[input];//for size
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter the "+i+" element ");
             int num = sc.nextInt();
             array[i]=num;
        }
        return array;
    }
    public static int getMinNumber(int[] array)
    {
        int maxValue = Integer.MAX_VALUE;
        int minValue =0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<maxValue)
            {
                maxValue = array[i];
                minValue=maxValue;
            }
        }
        return minValue;
    }


}