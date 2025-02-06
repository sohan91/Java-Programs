import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletion_Operation {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement stmt = connection.createStatement();
            String delete = String.format("Delete from student where rollno = %d",6);
            int result = stmt.executeUpdate(delete);
            if(result>0)
            {
                System.out.println("Deleted....");
            }
            else {
                System.out.println("Not Deleted");
            }
        }catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
