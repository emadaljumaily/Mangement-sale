package ttable;

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
public class t1 {
    private int id;
   private String nname;
    private String name;
    private int kmea;
    private int priciq;
    private int pricdolar;
    private int priceremain;
    private int totalprice;
    private Date date;
    
    
    public t1(){}
    public t1(int ID,String Nname,String Name,int kmeaa,int priceiq,int pricedolar,int Priceremain,int Totalprice,Date Date ){
        this.id=ID;
       this.nname=Nname;
        this.name=Name;
        this.kmea=kmeaa;
        this.priciq=priceiq;
        this.pricdolar=pricedolar;
        this.priceremain=Priceremain;
        this.totalprice=Totalprice;
        this.date=Date;
        
    }
    public int getIID(){
      return id;  
        
    }
  public String getNname(){
      return nname;
  }
  public void setNname(String Nname){
      this.nname=Nname;
  }
    
    public String getName(){
        return name;
        
    }
    public void setName(String Name){
        this.name=Name;
    }
    
  
    public int getkmeaa(){
        return kmea;
    }
    public int getpriceiq(){
        return priciq;
        
    }
    public int getpricedolar(){
        return pricdolar;
    }
    public int getPriceremain(){
        return priceremain;
        
    }
    public int getTotalprice(){
        return totalprice;
    }
  
    public Date getDate(){
        
        return date;
    }
}
