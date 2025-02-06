import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingUsingPreparedStmt {
    private static final String url = "jdbc:mysql://localhost:3306/ student_info";
    private static final String user = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try
        {
            Connection connection = DriverManager.getConnection(url,user,password);
            String query = "INSERT INTO student(rollno,name,marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            while (true)
            {
                System.out.print("Enter rollNo : ");
                int roll = sc.nextInt();
                System.out.print("Enter Name : ");
                String name = sc.next();
                System.out.print("Enter Maks Obtained : ");
                int marks = sc.nextInt();
                System.out.print("Still You want to enter the data(Yes/No) : ");
                String choice = sc.next();
                preparedStatement.setInt(1,roll);
                preparedStatement.setString(2,name);
                preparedStatement.setInt(3,marks);
                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("NO"))
                {
                    break;
                }
            }
            int[] arr = preparedStatement.executeBatch();

        }catch (SQLException s)
        {
            System.out.println(s.getMessage());
        }
    }
}
