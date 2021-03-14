package ttable;


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
import proj.Connections;
import proj.product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class query11 {
    public Connection getConnection(){
        Connection con = null;
        con = Connections.getConnection();
        return con;
    }
   public ArrayList<t1> wwww(){
      ArrayList<t1> list=new ArrayList<t1>();
        Connection con=getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT [id]\n" +
"      ,[nname]\n" +
"      ,[name]\n" +
"      ,[kmea]\n" +
"      ,[price]\n" +
"      ,[pricepaid]\n" +
"      ,[priceremain]\n" +
"      ,[totalprice]\n" +
"      ,[date]\n" +
"  FROM [dbo].[deon]";

        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            t1 p;
            while (rs.next()){
                p=new t1(rs.getInt("id"),rs.getString("nname"),rs.getString("name"),rs.getInt("kmea"),rs.getInt("price"),rs.getInt("pricepaid"),rs.getInt("priceremain"),rs.getInt("totalprice"),rs.getDate("date"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
   }
}
