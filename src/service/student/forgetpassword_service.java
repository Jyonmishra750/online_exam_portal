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
public class forgetpassword_service {
    public static boolean student_forgetpswd(String mail, String pwd){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update user_table set password = '"+pwd+"' where email = '"+mail+"'");
            return true;
        } catch (SQLException se) {
            
        }
        return false;
    }
}
