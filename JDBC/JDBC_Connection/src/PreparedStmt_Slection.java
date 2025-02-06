import java.io.FilterOutputStream;
import java.sql.*;

public class PreparedStmt_Slection {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";

    public static void main(String[] args) {
        try
        {
            Connection connection = DriverManager.getConnection(url,userName,password);
            String query = "Select name from Student where rollno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,2);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                System.out.println("Name : "+resultSet.getString("name"));
            }
            else {
                System.out.println("Name not Found..");
            }
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
