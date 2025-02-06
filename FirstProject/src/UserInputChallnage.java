import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputChallnage {
    public static void main(String[] args) {
        double sum =0;
        int count =0;
        for (int i = 0; i <5; i++) {

            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number ");
                double number = sc.nextDouble();
                sum+=number;
                count++;
            }
            catch (InputMismatchException e) {System.out.println("character type is not allowed..please enter the invalid number");
                count--;
                continue;

            }
        }

            System.out.println("Sum of enter 5 integer is " + sum);

    }
}



