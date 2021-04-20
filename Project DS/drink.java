package JavaA.restrunte;

public class drink extends Item{
  
  
  
 
    
    private String typeName,s;
    
    
    public drink(){}
  
    
    
    
      public   drink(int drinkNumber,String drinkName,String typeName,int AllAmount,float price){
super(drinkName,drinkNumber,AllAmount,price);
        
        this.typeName=typeName;
     
       
        }
        
      
      
      
      
  
  
 
  
  public void settype(String typeName){
   this.typeName=typeName;
 
     
   }
   
    
  
  
  
  
 public String gettype(){
    
   return typeName;}

  
  public String toString(){
    
    return getnumber()+"- "+typeName+" "+super. display();

}

  
   
  
}
