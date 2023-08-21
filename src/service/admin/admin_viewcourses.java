/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
import com.mysql.cj.conf.PropertyKey;
import java.sql.*;
public class admin_viewcourses {
    public static ResultSet getCourse(){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from course_table");
            return rs;
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
    
}

