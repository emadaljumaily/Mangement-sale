package proj;


 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class query {
    public String user;
    public String password;
    LogIn ww=new LogIn();
    String tt=ww.juser.getText();
    String hh=ww.jpass.getText();
    public Connection getConnection(){
        Connection con = null;
        con=Connections.getConnection();
        return con;
    }
   public ArrayList<product> www(){
      ArrayList<product> list=new ArrayList<product>();
        Connection con=getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT [itemid]\n" +
"      ,[namee]\n" +
"      ,[typeee]\n" +
"      ,[kmeaa]\n" +
"  FROM [dbo].[makhzn] ";

        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            product p;
            while (rs.next()){
                p=new product(rs.getInt("itemid"),rs.getString("namee"),rs.getString("typeee"),rs.getInt("kmeaa"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
   }
}
