/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
import javax.swing.JOptionPane;




/**
 *
 * @author pc
 */
public class UserDao {
    public static void save(User user) {
        String query = "insert into user(Id,Name,Email,MobileNumber,Address,Password,SecurityQuestion,Answer,Status) values ('"+user.getId()+"','"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getAnswer()+"','"+user.getSecurityQuestion()+"','"+user.getStatus()+"','False')";
        DBOperation.setDataOrDelete(query,"Registered successfully! Wait for Admin approval.");
        
    }
    public static User login(String email, String password) {
        User user = null;
        try{
            ResultSet rs = DBOperation.getData("select * from user" + "where email ='"+email+"'and password='"+password+"'");
            while(rs.next()) {
                user= new User();
                user.setStatus(rs.getString("status"));
            }
        }   catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
