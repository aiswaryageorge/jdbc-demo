package com.stackroute;

import com.stackroute.jdbcdemo.*;

public class App {

    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//
//        DataManager dataManager=new DataManager();
//        dataManager.getAllStudents();
//
//        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
//        databaseMetadataDemo.getDatabaseMetaData();
//
//        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
//        jdbcTransactionDemo.gettransactionData();

//        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
//        preparedStatementDemo.getCourseByName("java");
//
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo=new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.getbatchProcessing();

//        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
//        resultSetMetadataDemo.getAllStudents();
//
//        RowsetDemo rowsetDemo=new RowsetDemo();
//        rowsetDemo.getAllStudent();
    }
}
