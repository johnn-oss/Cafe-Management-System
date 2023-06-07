/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Tables {
    public static void main(String[] args) {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar (200), email varchar (200), mobileNumber varchar (11), address varchar (400), password varchar (50), securityQuestion varchar (200), answer varchar (200), status varchar (200), unique(email))";
        String adminDetails = "insert into user (name,email,address,password," + "securityQuestion,answer,status)" + " VALUES ('Admin','admin@gmail.com','123456789','Nigeria','admin123'," + " 'what is your best game',''soccer','true')";
        DBOperation.setDataOrDelete(userTable, "User Table created succecfully!");
        DBOperation.setDataOrDelete(adminDetails, "Admin Details added succecfully!");
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
    
        }
        
    }
    
}
