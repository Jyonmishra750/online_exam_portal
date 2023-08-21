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
public class admin_login_service {
   public static boolean valid_admin(String name, String password){
       try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from admin_table where name='"+name+"' and password = '"+password+"'");
            while(rs.next()){
                return true;
            }
       } catch (SQLException se) {
           se.printStackTrace();
       }
       return false;
   }
}
