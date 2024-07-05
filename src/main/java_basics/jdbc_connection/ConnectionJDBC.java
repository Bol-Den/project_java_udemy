package java_basics.jdbc_connection;

import java.sql.*;
import java.util.List;

abstract class ConnectionJDBC {

       private String url;
       private String user;
       private String password;

       ConnectionJDBC() {
           this.url = "jdbc:mysql://localhost:3306/employees_database";
           this.user = "root";
           this.password = "denis1987";
       }

       Statement getStatement() throws SQLException {
                Connection conn = DriverManager.getConnection(url, user, password);
                return conn.createStatement();
        }

        abstract List<String> getColumnData(String column, String table);

        abstract void insertNewRecords(int id, String name, String department, int salary);

        abstract void updateById(int id, String department);

}
