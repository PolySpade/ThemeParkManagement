/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Donald
 */
public class MyDb {
    Connection con;
    
    public Connection getCon() throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","Cc147220917!");
        } catch (SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }   
    
}
