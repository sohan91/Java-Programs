import javax.swing.*;
import java.sql.*;

public class Updation_Operation {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
        Connection connection = DriverManager.getConnection(url,userName, password);
        String query = String.format("UPDATE student set name = '%s' where marks = %d","Rajesh",35);
            Statement execute = connection.createStatement();
            int result = execute.executeUpdate(query);
            if(result>0)
            {
                System.out.println("Successfully Updated..!");
            }
            else {
                System.out.println("Not Updatad..");
            }
    }catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
 }
}
