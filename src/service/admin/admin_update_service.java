/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.admin;

/**
 *
 * @author HP
 */
import java.sql.*;
public class admin_update_service {
    public static boolean update_username(int id, String uname){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update admin_table set name = '"+uname+"' where id='"+id+"'");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
    
    public static boolean update_email(int id, String email){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update admin_table set email = '"+email+"' where id='"+id+"'");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
    
    public static boolean update_password(int id, String password){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update admin_table set password = '"+password+"' where id='"+id+"'");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
    
}

