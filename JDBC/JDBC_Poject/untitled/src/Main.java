import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String tableName = null;
    private static final String url = "jdbc:mysql://localhost:3306/projectdatabase";
    private static final String userName = "root";
    private static final String password = "sohan@2003";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            CRUDOperations crudOps = new CRUDOperations(connection);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Choose operation: ");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("ENTER : ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter table name: ");
                        String tableName = scanner.nextLine();
                        System.out.println("Enter columns (comma separated): ");
                        List<String> columns = Arrays.asList(scanner.nextLine().split(","));
                        System.out.println("Enter values (comma separated): ");
                        List<String> values = Arrays.asList(scanner.nextLine().split(","));
                        CRUDOperations.createRecord(tableName, columns, values);
                        System.out.println("=".repeat(50));
                        break;

                    case 2:
                        System.out.println("Enter table name: ");
                        tableName = scanner.nextLine();
                        System.out.println("Enter columns to retrieve (comma separated, use '*' for all): ");
                        List<String> readColumns = Arrays.asList(scanner.nextLine().split(","));
                        System.out.println("Enter ID to read: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        crudOps.readRecord(tableName, readColumns, id);
                        System.out.println("=".repeat(50));
                        break;
                    case 3:
                        System.out.println("Enter table name: ");
                        tableName = scanner.nextLine();
                        System.out.println("Enter ID to update: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Enter columns to update (comma separated): ");
                        List<String> updateColumns = Arrays.asList(scanner.nextLine().split(","));
                        System.out.println("Enter new values (comma separated): ");
                        List<String> newValues = Arrays.asList(scanner.nextLine().split(","));
                        crudOps.updateRecord(tableName, id, updateColumns, newValues);
                        System.out.println("=".repeat(50));
                        break;
                    case 4:
                        System.out.println("Enter table name: ");
                        tableName = scanner.nextLine();
                        System.out.println("Enter ID to delete: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        crudOps.deleteRecord(tableName, id);
                        System.out.println("=".repeat(50));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            }catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }

    }
}
