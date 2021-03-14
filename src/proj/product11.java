package proj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class product11 {
    
private int id;
private int iid;
    private String name;
      private String type;
    private int kmea;
     private int price;
     private int priceremain;
      private int total;
  
    
    public product11(){}
    public product11(int ID,int iiD,String Name,String typee,int kmeaa,int Price,int priceremain,int Total ){
        
        this.id=ID;
        this.iid=iiD;
        this.name=Name;
      this.type=typee;
        this.kmea=kmeaa;
       this.price=Price;
       this.priceremain=priceremain;
       this.total=Total;
        
    }

    
 
   
  
   public int getID(){
        return id;
    }
   public int getiiD(){
       return iid;
   }
    public String getName(){
        return name;
        
    }
    public void setName(String Name){
        this.name=Name;
    }
      public String gettype(){
        return type;
        
    }
    public void settype(String typee){
        this.type=typee;
    }
    
  
    public int getkmeaa(){
        return kmea;
    }
  public int getprice(){
        return price;
    }
  public int getpriceremain(){
        return priceremain;
    }
   public int gettotal(){
        return total;
    }
}
