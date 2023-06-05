/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;

/**
 *
 * @author pc
 */
public class UserDao {
    public static void save(User user) {
        String query = "insert into user(Name,Email,MobileNumber,Address,Password,SecurityQuestion,Answer,Status) values ('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getAnswer()+"','"+user.getSecurityQuestion()+"','"+user.getStatus()+"','False')";
        DBOperation.setDataOrDelete(query,"Registered successfully! Wait for Admin approval.");
        
    }
}
