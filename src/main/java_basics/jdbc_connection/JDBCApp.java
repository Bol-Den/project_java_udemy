package java_basics.jdbc_connection;

class JDBCApp {

    public static void main(String[] args) {

        ConnectionJDBC jdbc = new ConnectionJDBC();

//        jdbc.updateById(300);
        jdbc.insertNewRecords(1000,"Angela","Production", 5755);
        jdbc.printColumnData("department", "employees_tbl");

    }
}
