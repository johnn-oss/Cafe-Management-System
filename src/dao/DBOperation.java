/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;

/**
 *
 * @author pc
 */
public class DBOperation {
    public static void setDataOrDelete(String query, String message) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement smt = con.createStatement();
            smt.executeUpdate(query);
            if(!message.equals(""))
                JOptionPane.showMessageDialog(null,message);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Mesage",JOptionPane.ERROR_MESSAGE);
        }
    } 
}
