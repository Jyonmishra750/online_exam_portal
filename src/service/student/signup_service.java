/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.student;

/**
 *
 * @author HP
 */
import java.sql.*;
public class signup_service {
    public static boolean student_signup(String roll, String name, String email, String password, String address, String phone){
        String marks = "0";
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            //Statement st = cn.createStatement();
            PreparedStatement ps = cn.prepareStatement("insert into user_table values(?,?,?,?,?,?,?)");
            ps.setString(1, roll);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, address);
            ps.setString(6, phone);
            ps.setString(7, marks);
            ps.executeUpdate();
            //st.executeUpdate("insert into user_table values('"+roll+"','"+name+"','"+email+"','"+password+"','"+address+"','"+phone+"')");
            return true;
            
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return false;
    }
}
