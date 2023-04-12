package com.example.mytest_springboot.controller;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///232haoqingnian?user=root&password=root");
        String sql="select * from love";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Object name = resultSet.getObject("name");
            Object days = resultSet.getObject("days");
            System.out.println(name+""+days);
        }
    }
}
