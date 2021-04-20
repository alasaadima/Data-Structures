package JavaA.restrunte;



public class food extends Item{
  private String typeName,s;
  
  
  
  public food(){
    
  }
   public    food(int foodNumber,String foodName,String typeName,int amount,float price){super(foodName,foodNumber,amount,price);
        
        this.typeName=typeName;
     
       
        }
        
    
      
      
      
      
  
  
 
  
  public void settype(String typeName){
   this.typeName=typeName;
 
     
   }
   
    
  
  
  
  
  public String gettype(){
    
    return typeName;}

  
  public String toString(){
    
    return  getnumber()+"- "+ typeName+" "+super. display();

}
  
}
