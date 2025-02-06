import jdk.jshell.spi.SPIResolutionException;

import java.awt.dnd.DragGestureEvent;
import java.io.FilterOutputStream;
import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {
    private static final String url = "jdbc:mysql://localhost:3306/ student_Info";
    private static final String user = "root";
    private static final String password = "sohan@2003";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);
            Statement statement = connection.createStatement();
            while (true) {
                System.out.print("Enter rollNo : ");
                int roll = sc.nextInt();
                System.out.print("Enter Name : ");
                String name = sc.next();
                System.out.print("Enter Maks Obtained : ");
                int marks = sc.nextInt();
                System.out.print("Still You want to enter the data(Yes/No) : ");
                String choice = sc.next();
                String query = String.format("INSERT into student(rollno,name,marks) VALUES(%d,'%s',%d)",roll,name,marks);
                statement.addBatch(query);
                if (choice.toUpperCase().equals("NO")) {
                    break;
                }
            }
            int[] arr = statement.executeBatch();
//            for(int i = 0; i<arr.length;i++)
//            {
//                if(arr[i] == 0)
//                {
//                    System.out.println("Query"+i+" is not executed Properly");
//                }
//            }

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
