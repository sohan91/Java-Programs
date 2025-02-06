import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;

    public class CRUDOperations {

        private static Connection connection;

        public CRUDOperations(Connection connection) {
            this.connection = connection;
        }

        public static void createRecord(String tableName, List<String> columns, List<String> values) throws SQLException {
            String columnNames = String.join(", ", columns);
            // Create placeholders for SQL query
            String placeholders = values.stream()
                    .map(v -> "?")
                    .collect(Collectors.joining(", "));

            String query = String.format("INSERT INTO %s (%s) VALUES (%s)", tableName, columnNames, placeholders);

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                for (int i = 0; i < values.size(); i++) {
                    stmt.setString(i + 1, values.get(i));
                }
                int rowsInserted = stmt.executeUpdate();
                System.out.println(rowsInserted > 0 ? "Record created successfully." : "Failed to create record.");
            }
        }

        public void readRecord(String tableName, List<String> columns, int id) throws SQLException {
            String columnNames = columns.isEmpty() ? "*" : String.join(", ", columns);
            String query = String.format("SELECT %s FROM %s WHERE id = ?", columnNames, tableName);

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        for (String column : columns) {
                            System.out.println(column + ": " + rs.getString(column));
                        }
                    } else {
                        System.out.println("No record found with ID " + id);
                    }
                }
            }
        }

        public void updateRecord(String tableName, int id, List<String> columns, List<String> newValues) throws SQLException {
            if (columns.size() != newValues.size()) {
                throw new IllegalArgumentException("Columns and values sizes must match.");
            }

            String setClause = String.join(", ", columns.stream().map(col -> col + " = ?").toArray(String[]::new));
            String query = String.format("UPDATE %s SET %s WHERE id = ?", tableName, setClause);

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                for (int i = 0; i < newValues.size(); i++) {
                    stmt.setString(i + 1, newValues.get(i));
                }
                stmt.setInt(newValues.size() + 1, id);
                int rowsUpdated = stmt.executeUpdate();
                System.out.println(rowsUpdated > 0 ? "Record updated successfully." : "Failed to update record.");
            }
        }

        public void deleteRecord(String tableName, int id) throws SQLException {
            String query = String.format("DELETE FROM %s WHERE id = ?", tableName);
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, id);
                int rowsDeleted = stmt.executeUpdate();
                System.out.println(rowsDeleted > 0 ? "Record deleted successfully." : "Failed to delete record.");
            }
        }
    }







