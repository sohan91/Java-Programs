import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/transaction";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            String debit = "UPDATE employee set amount = amount - ? where id = ?";
            String credit = "UPDATE employee set amount = amount + ? where id = ?";
            PreparedStatement forDebit = connection.prepareStatement(debit);
            PreparedStatement forCredit = connection.prepareStatement(credit);
            forDebit.setDouble(1,-3300);
            forDebit.setInt(2,102);
            forCredit.setDouble(1,3000);
            forCredit.setInt(2,101);
            int executingCredit = forCredit.executeUpdate();
            int executingDebit = forDebit.executeUpdate();
            connection.close();
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
