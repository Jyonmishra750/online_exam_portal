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
public class login_service {
    public static boolean valid_student(String roll, String password){
       try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from user_table where roll_no='"+roll+"' and password = '"+password+"'");
            while(rs.next()){
                return true;
            }
       } catch (SQLException se) {
           se.printStackTrace();
       }
       return false;
   }
}
