import java.sql.*;

public class PreparedStmt_deletion {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "delete from student where rollno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,3);
            int result = preparedStatement.executeUpdate();
            if(result>0)
            {
                System.out.println("Deleted");
            }
            else {
                System.out.println("Not deleted");
            }

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
