import javax.swing.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Random;

public class Insertion_Operation {
    private static final String url = "jdbc:mysql://localhost:3306/student_Info";

    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Enter userName", null);//to display th dialouge
        JPasswordField jp = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, jp, "Enter DB Password", JOptionPane.OK_CANCEL_OPTION);
        final char[] password = (okCxl == JOptionPane.OK_OPTION) ? jp.getPassword() : null;

        try {
            Connection connection = DriverManager.getConnection(
                    url, userName, String.valueOf(password)); // Corrected variable name
            System.out.println("Success!! Connection made to the database");
            Arrays.fill(password, ' ');
            Statement stmt2 = connection.createStatement();
            String query = String.format("INSERT INTO student(rollno,name,marks) VALUES(%o,'%s',%o  )", 6,"Rohit",29);
            int  result = stmt2.executeUpdate(query);
           if(result>0)
           {
               System.out.println("Successfully Inserted..!");

           }
           else {
               System.out.println("Something went wrong");
           }
        } catch (SQLException c) {
            System.out.println(c);
        }
    }

}