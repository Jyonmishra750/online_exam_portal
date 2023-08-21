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
public class admin_updatequestion_service {
    public static boolean update_question(String qid, String qname, String opti1, String opti2, String opti3, String opti4, String ans){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update question_table set name='"+qname+"', opt1='"+opti1+"', opt2='"+opti2+"', opt3='"+opti3+"', opt4='"+opti4+"', answer='"+ans+"' where qid = '"+qid+"'");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
}
