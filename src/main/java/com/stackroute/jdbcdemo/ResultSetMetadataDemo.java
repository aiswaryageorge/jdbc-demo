package com.stackroute.jdbcdemo;
import java.io.Reader;
import java.sql.*;
public class ResultSetMetadataDemo {
    public void getAllStudents() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from course");
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println("Total columns: " + resultSetMetaData.getColumnCount());
            System.out.println("First column name: " + resultSetMetaData.getColumnName(1));
            System.out.println("First column datatype: " + resultSetMetaData.getColumnTypeName(1));
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
