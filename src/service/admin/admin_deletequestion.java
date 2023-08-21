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
public class admin_deletequestion {
    public static boolean delete_question(String qid){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("delete from question_table where qid = '"+qid+"' ");
            return true;
            
        } catch (SQLException se) {
            
        }
        return false;
    }
}
