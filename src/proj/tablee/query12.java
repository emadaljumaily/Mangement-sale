package proj.tablee;


import ttable.*;
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
public class query12 {
    public Connection getConnection(){
        Connection con = null;
        con =Connections.getConnection();
        return con;
    }
   public ArrayList<t12> wwww(){
      ArrayList<t12> list=new ArrayList<t12>();
        Connection con=getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT TOP 1000 [iid]\n" +
"      ,[itemid]\n" +
"      ,[name]\n" +
"  FROM [mbeaat1].[dbo].[ITEM]";

        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            t12 p;
            while (rs.next()){
                p=new t12(rs.getInt("iid"),rs.getInt("itemid"),rs.getString("name"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query12.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
   }
}
