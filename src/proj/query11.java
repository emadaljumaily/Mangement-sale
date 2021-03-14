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
public class query11 {
    public Connection getConnection(){
        Connection con = null;
        con =Connections.getConnection();
        return con;
    }
   public ArrayList<product11> www(){
      ArrayList<product11> list=new ArrayList<product11>();
        Connection con=getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT ITEM.iid,DITEM.id,ITEM.name,DITEM.typee,DITEM.kmea,DITEM.price,DITEM.priceremain,DITEM.totalprice FROM ITEM,DITEM WHERE ITEM.itemid=DITEM.itemid";

        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            product11 p;
            while (rs.next()){
                p=new product11(rs.getInt("id"),rs.getInt("iid"),rs.getString("name"),rs.getString("typee"),rs.getInt("kmea"),rs.getInt("price"),rs.getInt("priceremain"),rs.getInt("totalprice"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query11.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
   }
}
