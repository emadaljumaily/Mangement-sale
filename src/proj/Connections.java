/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author emada
 */
public class Connections {
    
   private static String url="jdbc:sqlserver://localhost:1433;databaseName=mbeaat1;";
   public static String user; 
   public static String  password; 
   public static Connection con;
    
    public static Connection getConnection(){
        try{
            con=DriverManager.getConnection(url,user,password);
        }
        catch(Exception ex){
            
           ex.printStackTrace();
            
        }
       return con;
        
    }
}
