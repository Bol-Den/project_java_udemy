package java_basics.jdbc_connection;

import java.sql.*;

class ConnectionJDBC {

       private String url;
       private String user;
       private String password;

       ConnectionJDBC() {
           this.url = "jdbc:mysql://localhost:3306/employees_database";
           this.user = "root";
           this.password = "denis1987";
       }

       void insertNewRecords(int id, String name, String department, int salary) {
            String queryText = "insert into employees_tbl values("
                                     + id + ",'"
                                     + name + "','"
                                     + department + "',"
                                     + salary + ");";

            try {
                getStatement().executeUpdate(queryText);
            } catch (SQLException e) {
                System.out.println("Can't insert data");
            }
       }

       void updateById(int id) {
           String queryText = "update employees_tbl set department = \"HR+\" where id =" + id + ";" ;
           try {
               getStatement().executeUpdate(queryText);
           } catch (SQLException e) {
               System.out.println("Can't update data");
           }
       }

       void printColumnData(String column, String table) {
           String queryText = "select * from " + table +";" ;
           try {
               ResultSet result = getStatement().executeQuery(queryText);
               while (result.next()) {
                   System.out.println(result.getString(column));
               }
           } catch (SQLException e) {
               System.out.println("Can't retrieve data");
           }
       }

       private Statement getStatement() throws SQLException {
                Connection conn = DriverManager.getConnection(url, user, password);
                return conn.createStatement();
        }

}
