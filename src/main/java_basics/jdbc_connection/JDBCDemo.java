package java_basics.jdbc_connection;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

       String url = "jdbc:mysql://localhost:3306/employees_database";
        try {
            //// established connection object
            Connection conn = DriverManager.getConnection(url, "root", "denis1987");

            //// establish the statement object to send to database
            Statement statement = conn.createStatement();

            //// execute statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            //// process the result
            int salaryTotal = 0;
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
//                int salary = resultSet.getInt("salary");
                int salary = Integer.parseInt(resultSet.getString("salary"));
                System.out.println(name + " " + department + " " + salary) ;
                salaryTotal += salary;
            }
            System.out.println("total salary: " + salaryTotal);

        } catch (SQLException e) {
//            throw new RuntimeException(e);
              e.printStackTrace();
        }

    }
}
