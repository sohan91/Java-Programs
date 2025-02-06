import java.sql.*;

public class PreparedStmt_UpdateOperation {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            String update = "update student set name = ? where rollno = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1,"Prabha");
            preparedStatement.setInt(2,5);
            int result = preparedStatement.executeUpdate();
            if(result>0)
            {
                System.out.println("Updated..");
            }
            else {
                System.out.println("Not Updataed");
            }
        }catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

//         try {
//             Connection con = DriverManager.getConnection(url,userName,password);
//             String update = "delete marks student where rollno = ?";
//             PreparedStatement preparedStatement = con.prepareStatement(update);
//             preparedStatement.setInt(1,5);
//             int result = preparedStatement.executeUpdate();
//             if(result>0)
//             {
//                 System.out.println("Deleted SuccesFully..");
//             }
//             else {
//                 System.out.println("Not Updataed");
//             }
//         }catch (SQLException e)
//         {
//             System.out.println(e.getMessage());
//         }

         try
         {
             Connection connection = DriverManager.getConnection(url,userName,password);
             String read = "Select name from student WHERE rollno = ?";
             PreparedStatement preparedStatement = connection.prepareStatement(read);
             preparedStatement.setInt(1,2);
//             preparedStatement.setString(2,"Sohan");
             ResultSet result = preparedStatement.executeQuery();
             while (result.next()) {
                 System.out.println("Name = "+result.getString("name"));
//                 System.out.println("Name = "+result.getString("name"));
//                 System.out.println("marks = "+result.getInt("marks"));
                 System.out.println("-".repeat(50));
             }
         }catch (SQLException o)
         {
             throw new RuntimeException(o);
             }
         }

    }
