package java_basics.jdbc_connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ActionsWithJDBC extends ConnectionJDBC {

    ActionsWithJDBC(){
        super();
    }

    @Override
    List<String> getColumnData(String column, String table) {
        List<String> names = new ArrayList<>();
        String queryText = "select * from " + table +";" ;
        try {
            Statement statement = super.getStatement();
            ResultSet retrievedData = statement.executeQuery(queryText);
            while (retrievedData.next()) {
                 String name = retrievedData.getString(column);
                 names.add(name);
            }
        } catch (SQLException e) {
            System.out.println("Can't retrieve data");
        }
        return names;
    }

    @Override
    void insertNewRecords(int id, String name, String department, int salary) {
        String queryText = "insert into employees_tbl values("
                + id + ",'"
                + name + "','"
                + department + "',"
                + salary + ");";

        try {
            super.getStatement().executeUpdate(queryText);
        } catch (SQLException e) {
            System.out.println("Can't insert data");
        }
    }

    @Override
    void updateById(int id, String department) {
        String queryText = "update employees_tbl set department = '" + department + "' where id =" + id + ";" ;
        try {
            getStatement().executeUpdate(queryText);
        } catch (SQLException e) {
            System.out.println("Can't update data");
        }
    }

}
