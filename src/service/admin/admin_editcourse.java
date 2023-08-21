/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.admin;

/**
 *
 * @author HP
 */import java.sql.*;
public class admin_editcourse {
    public static boolean update_course(String cid, String cname){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update course_table set name='"+cname+"' where id = '"+cid+"'");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
}
