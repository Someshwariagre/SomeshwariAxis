package org.example;

import java.sql.*;

public class DBCon {

    public static Connection getConnection() throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sep_08","root","Xworkzodc@123");
        System.out.println(con);
        Statement s = con.createStatement();
        ResultSet r = s.executeQuery("select * from chess_detail");
        while(r.next()){
            System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+r.getString(3));
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {

        DBCon db = new DBCon();
        getConnection();

    }
}
