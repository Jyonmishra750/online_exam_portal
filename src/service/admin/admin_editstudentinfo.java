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
public class admin_editstudentinfo {
    public static boolean edit_studentifo(String sroll, String sname, String semail, String saddress, String sphone){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update user_table set name='"+sname+"', email='"+semail+"', address='"+saddress+"', phone='"+sphone+"' where roll_no = '"+sroll+"'");
            return true;
            
        } catch (SQLException se) {
        }
        return false;
    }
}
