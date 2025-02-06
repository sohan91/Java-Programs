import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] integrType = new int[10];
        integrType[1] = 10;
        System.out.println((integrType[1]));
        integrType[5] = 100;
        System.out.println(integrType.length);
        System.out.println(integrType[5]);
         String[] nameList = new String[5];
         nameList[1]="sohan";
         nameList[2] = "mani";
         nameList[3] = "latha";
         System.out.printf("%s\n",nameList[1],"%s",nameList[2],"%s",nameList[3]);
         System.out.println(""+nameList[2]);
         System.out.println(""+nameList[3]);
         String namesList[] = {"mani","Sohan","ammi"};
     for(int j = 0;j<namesList.length;j++)
     {
         System.out.printf("%s ",namesList[j]);
     }
         int[] numList = new int[]{1,0,5,6,5,4};
         System.out.println("\nlength = "+numList.length);
         for(int i=0; i<numList.length;i++)
         {
             System.out.printf("%d ",numList[i]);
         }
         System.out.println("");
     System.out.println(Arrays.toString(numList));
         int[] newArray;
        for(int element : numList)
        {
            System.out.print(element+" ");
        }
        int number[] = new int[8];
        System.out.println("");
        for(int number1 : number)
        {
            System.out.print(number1+" ");
        }
        System.out.println("");
        String name[] = new String[]{"mani","sohan","latha"};
        System.out.println(Arrays.toString(name));
    }
}
