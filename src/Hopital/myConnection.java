/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hopital;
import java.sql.*;
/**
 *
 * @author Badr
 */
public class myConnection {
    public static Connection getCon(){
        try {
          
        
        Connection con=DriverManager.getConnection("jdbc:ucanaccess://hpm.accdb");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
