package enrollmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {

        Connection conn = null;

        String url = "jdbc:mysql://127.0.0.1:3306/datastore";
        String user = "root";
        String password = "";

        try {

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the database!");

        } catch (SQLException e) {

            System.out.println("Connection failed!");
            e.printStackTrace();

        }

        return conn;
    }
}