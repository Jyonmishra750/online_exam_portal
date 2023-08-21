/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author HP
 */
import java.sql.*;
public class ConnectionDB {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/online_exam_db";
    private static String user = "root";
    private static String password = "root";
    public static Connection getConnectionDB() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected.");  
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }catch (SQLException se) {
            se.printStackTrace();
        } finally{
            return cn;
        }
    } 
    public static void main(String args[]){
        getConnectionDB();
    }
    
}
