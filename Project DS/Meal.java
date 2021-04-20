package JavaA.restrunte;

import java.util.ArrayList;


import java.util.*;

public class Meal {
  
  
public ArrayList <Item>theItem=new ArrayList<>();
 
public int ItemNum;

private Item I=new Item();
private food f=new food();
private drink d=new drink();

private float soldTotal=0;
private String infD;
 private String infS;
 private String infH;

    public Meal(){

    }
      
         
  
        
        
        
  public String addtheItem( Item newItem){
      // add another Item 
        String RE;
        
       // if(I.getNumber(i).equals())
            theItem.add(newItem);
            ItemNum++;
            RE="It is added √\n";
            return RE;
            
    }
public  String deletItem(int delNumber) {
  
  String RE;
  
    if(delNumber>theItem.size()||delNumber<0) 
         RE="Number of Item is not found!!\n" ;
      
     
     else {
     
        theItem.remove(delNumber - 1);
    ItemNum--;
RE=" The Item is deleted √\n";
    }

return RE;
}


    
   public String SaleItem(int ItemNo,int ItemAmount){
    
    if(ItemNo>theItem.size()||ItemNo<0)
        infD="Item Number is not found!!";
         
       
       
       else {
       I= theItem.get(ItemNo-1);
       
        if(ItemAmount>I.getamount())
         infD="we don't have this amount!!";
      
     
   else{
     int g=67;
  if(g==87) {
    infH="_______________________________________________________\nName         Amount          total price\n_______________________________________________________\n";
     infD+=I.getName()+"          "+f.gettype()+"          "+ItemAmount+"          "+(I.getprice()*ItemAmount)+"$\n";
     
     
    I.setamount(I.getamount()-ItemAmount);
    
soldTotal=soldTotal+I.getprice()*ItemAmount;
    }
    
    else{
    infS="______________________________________________________\nName         Amount\n______________________________________________________\n";
     infD+=I.getName()+"          "+d.gettype()+"          "+ItemAmount+"          "+(I.getprice()*ItemAmount)+"$\n";
     
     
    I.setamount(I.getamount()-ItemAmount);
    
    
soldTotal=soldTotal+I.getprice()*ItemAmount; }}}


     
     return infS+infD+"Total price=  "+soldTotal;}
   
        
        
        
        
        
 public String  displayAllItem() {

        //output each food in turn
        infH="________________________________________________________\n   No        Name        Amount          price\n________________________________________________________\n";
       for(Item i:theItem)
           infD+="   "+i.toString()+"\n";
//        for( int i=0; i < theItem.size(); ++i)
//        {
//        infD+=theItem.get(i).toString()+"\n";
//        }
        infD+="__________________________________________________\n";
        return infH+infD;
        }
        
  
      }
        
        
        
        

  
  
  
  

