/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lyn
 */
public class connectdb {
    Connection con=null;
    
    public static Connection ConnectDB(){
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/card_notification","root", "");
        return con;
    }
    catch(ClassNotFoundException | SQLException e){
     JOptionPane.showMessageDialog(null, "No Database Connection","Error", JOptionPane.ERROR_MESSAGE);
     return null;
    
      }
    }
}