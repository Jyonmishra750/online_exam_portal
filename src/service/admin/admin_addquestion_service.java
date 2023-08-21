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
public class admin_addquestion_service {
    public static boolean addquestion(String qid, String qname, String opti1, String opti2, String opti3, String opti4, String ans){
        try {
            Connection cn = repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("insert into question_table (qid,name,opt1,opt2,opt3,opt4,answer) values ('"+qid+"', '"+qname+"', '"+opti1+"', '"+opti2+"', '"+opti3+"', '"+opti4+"', '"+ans+"') ");
            return true;
            
        } catch (SQLException e) {
        }
        return false;
    }
}
