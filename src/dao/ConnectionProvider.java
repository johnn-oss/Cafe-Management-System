/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author pc
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mySql.jdbc.Driver");// This is the driver for mySql database conncetion
            Connection con = DriverManager.getConnection("jdbc:mySql://localhost:3306/cms?useSSL=false","pc","password@admin123");
            return con;
        }
        catch (ClassNotFoundException|SQLException e) {
            return null;
        }
    }
    
}
