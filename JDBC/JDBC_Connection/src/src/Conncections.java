
import java.sql.*;

public class Conncections {
    private final static String con = "jdbc:mysql://localhost:3306/music";
    private final static String userName ="root";
    private final static String password ="sohan@2003";

    public static void main(String[] args) {
       try {
           Connection connection = DriverManager.getConnection(con,userName,password);
          Statement stmt = connection.createStatement();
           String query = "select * from music.artists";
           ResultSet resultSet = stmt.executeQuery(query);
//           while (resultSet.next())
//           {
//               System.out.println("rollno : "+resultSet.getInt("RollNo"));
//               System.out.println("Name : "+resultSet.getString("name"));
//               System.out.println("Marks : "+resultSet.getInt("marks"));
//System.out.println("-".repeat(30));
//           }

System.out.println("1st Coloum index rollno and names");
           System.out.println("-".repeat(30));
while (resultSet.next())
{
    System.out.printf("%d. %s \n",resultSet.getInt(1),resultSet.getString("artist_name"));
}

       }catch (SQLException c)
       {
           throw new RuntimeException(c);
       }


    }
}
