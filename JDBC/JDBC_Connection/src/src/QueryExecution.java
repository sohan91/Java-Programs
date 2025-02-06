import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.sql.*;
import java.util.Arrays;

public class QueryExecution {
    private static final String url = "jdbc:mysql://localhost:3306/Student_Info"; // Corrected URL
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
            Statement stmt = connection.createStatement(); // Corrected variable name
            String query = "SELECT * FROM student";
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.println("rollNo : " + result.getInt("rollNo"));
                System.out.println("Name : " + result.getString("Name"));
                System.out.println("Marks : " + result.getInt("marks"));// Corrected column name
                System.out.println("-".repeat(30));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
