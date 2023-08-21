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
public class admin_deletestudent {
    public static boolean delete_student(String roll){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("delete from user_table where roll_no = '"+roll+"' ");
            return true;
            
        } catch (SQLException se) {
            
        }
        return false;
    }
}
