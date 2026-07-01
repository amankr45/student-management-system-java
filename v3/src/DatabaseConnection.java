package StudentManagementSystem.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5434/student_management_system";

    private static final String USER = "stmspostgres";

    private static final String PASSWORD = "stmspostgres";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException("Database Connection Failed",e);
        }
    }
}
