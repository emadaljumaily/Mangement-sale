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
public class product1 {
    
    private int id;
    private String name;
   private String type;
    private int kmea;
    private int price;
    private int totalprice;
   
    
    public product1(){}
    public product1(int ID,String Name,String Type,int kmeaa,int Price,int Totalprice ){
        
        this.id=ID;
        this.name=Name;
        this.type=Type;
        this.kmea=kmeaa;
        this.price=Price;
        this.totalprice=Totalprice;
    }

    
  public int getId(){
      return id;
  }
   
  
  
    public String getName(){
        return name;
        
    }
    public void setName(String Name){
        this.name=Name;
    }
 public String getType(){
        return type;
        
    }
    public void setType(String Type){
        this.type=Type;
    }
  
    public int getkmeaa(){
        return kmea;
    }
     public int getPrice(){
        return price;
    }
      public int getTotal(){
        return totalprice;
    }
   
}
