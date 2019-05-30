package com.stackroute.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcTransactionDemo {
    public void gettransactionData() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into course values(8,'java',23)");
            stmt.executeUpdate("insert into course values(7,'mango db',24)");
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}