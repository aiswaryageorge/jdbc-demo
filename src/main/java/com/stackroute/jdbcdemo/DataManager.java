package com.stackroute.jdbcdemo;


import java.sql.*;

public class DataManager {
    public void getAllStudents() {
        //register driver
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo", "root", "Root@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from course");
            resultSet.absolute(4);
            while (resultSet.previous()) {
                int id = resultSet.getInt(1);
                System.out.println(id);
            }

        } catch (ClassNotFoundException cnfException) {
            cnfException.printStackTrace();
//            System.out.println("exception thrown"+cnfException.getStackTrace());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
//            System.out.println("exception thrown"+sqlException.getStackTrace());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
