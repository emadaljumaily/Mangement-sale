package proj.tablee;

import ttable.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class t12 {
    private int id;
   private int itemid;
    private String name;
  
    
    
    public t12(){}
    public t12(int ID,int Itemid,String Nname ){
        this.id=ID;
      this.itemid=Itemid;
        this.name=Nname;
      
        
    }
    public int getIID(){
      return id;  
        
    }
 public int getItemid(){
      return itemid;  
        
    }
    
    public String getName(){
        return name;
        
    }
    public void setName(String Name){
        this.name=Name;
    }
    
  

}
