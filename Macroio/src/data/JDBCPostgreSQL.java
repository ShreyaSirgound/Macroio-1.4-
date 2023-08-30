package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgreSQL {
    private final String url = "jdbc:postgresql://localhost/macroio";
    private final String user = "postgres";
    private final String password = "admin123";

    public void connect() {
        try(Connection connection = DriverManager.getConnection(url, user, password);){
            if(connection != null) {
                System.out.println("Connected to PostgreSQL server successfully");
            } else {
                System.out.println("Failed to connect to the PostgreSQL server");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}