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
public class product {
    
    private int id;
    private String name;
    private String type;
    private int kmea;
 
   
    
    public product(){}
    public product(int ID,String Name,String typee,int kmeaa ){
        
       this.id=ID;
        this.name=Name;
      
        this.kmea=kmeaa;
       this.type=typee;
        
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
    public void setType(String typee){
        this.type=typee;
    }
  
    public int getkmeaa(){
        return kmea;
    }
   
}
