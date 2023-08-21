/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.admin;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class admin_addcourse {
    public static boolean addcourse(String id, String cname){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("insert into course_table (id,name) values ('"+id+"', '"+cname+"') ");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
    
}
