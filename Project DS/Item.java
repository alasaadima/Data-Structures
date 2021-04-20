package JavaA.restrunte;

public class Item {
  
  private String Name;
   
   

  private float price,total=0;
 private int  number;
 private int amount;
 
 public Item(){}

 public  Item(String Name,int number,int amount,float price){
   
   this.Name=Name;
   this.number=number;
   this.amount=amount;
   this.price=price;}
 
  
  public void setnumber(int number){
    this.number=number;
    }
    
 
  
  public int getnumber(){
    return number;
  }
  
  
  public void setName(String Name){
    
   this.Name=Name;
    
    
  }
  
  public String  getName(){
    return Name;
    
  }
  
  
  
  
  public void  setprice(float price){
    this.price=price;
    
  }
  
  
 
  
  public float  getprice(){
    return price;
    
  }
  
  
  public void setamount (int amount){
   this.amount=amount;
    
  }
  
  
  
  public int getamount(){
    return amount;
  }
 
    
    
      public String display(){
     
        String inf=" "+Name+"         "+amount+"            "+ price+"$ \n";
        return inf;
    }
   
  
  
}
