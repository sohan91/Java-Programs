import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared_Statement {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection conncection = DriverManager.getConnection(url, userName, password);
            String query = "insert into student(rollno,name,marks) values(?,?,?)";
            PreparedStatement preparedStatement = conncection.prepareStatement(query);
            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"Mahesh");
            preparedStatement.setInt(3,21);
            int output = preparedStatement.executeUpdate();
            if (output>0)
            {
                System.out.println("Inserted Successfully");
            }
            else {
                System.out.println("Nothing is Inserted");
            }
        }catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }
}
