package java_basics.jdbc_connection;

import java.util.List;

class JDBCApp {

    public static void main(String[] args) {

        ActionsWithJDBC actions = new ActionsWithJDBC();

        List<String> names = actions.getColumnData("name","employees_tbl");
        System.out.println(names);

        actions.insertNewRecords(1300,"Tom","Sales", 6755);

        List<String> names2 = actions.getColumnData("name","employees_tbl");
        System.out.println(names2);

        List<String> department = actions.getColumnData("department","employees_tbl");
        System.out.println(department);

//        actions.updateById(1200, "Marketing");

        List<String> department2 = actions.getColumnData("department","employees_tbl");
        System.out.println(department2);

    }
}
