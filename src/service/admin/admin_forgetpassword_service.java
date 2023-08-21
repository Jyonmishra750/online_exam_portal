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
public class admin_forgetpassword_service {
    public static boolean admin_forgetpswd(String mail, String pwd){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update admin_table set password = '"+pwd+"' where email = '"+mail+"'");
            return true;
        } catch (SQLException se) {
            
        }
        return false;
    }
}
