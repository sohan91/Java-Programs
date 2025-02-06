import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayFirst[][] = new int[4][4];
        System.out.println("length = "+arrayFirst.length);


        for(int i =0 ; i < arrayFirst.length;i++)
        {
            for (int j = 0;j<arrayFirst[i].length;j++)
            {
                System.out.print(arrayFirst[j]+" ");

            }

            System.out.println( );
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.deepToString(arrayFirst)+"\n".repeat(3));
    }
}
