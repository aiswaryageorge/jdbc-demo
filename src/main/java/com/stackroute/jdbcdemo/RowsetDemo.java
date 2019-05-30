package com.stackroute.jdbcdemo;


import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.*;
public class RowsetDemo {
    public void getAllStudents() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rowSet = new JdbcRowSetImpl();
            rowSet.setUrl("jdbc:mysql://localhost:3306/studentInfo");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from course");
            rowSet.execute();
            while (rowSet.next()) {
                // each call to next, generates a cursorMoved event
                System.out.println("id = " + rowSet.getInt(1));
                System.out.println("name = " + rowSet.getString(2));
            }
        } catch (Exception exception) {
            exception.printStackTrace();

        }

    }
}
