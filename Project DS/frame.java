package JavaA.restrunte;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.time.LocalDate;

public class frame extends JFrame implements ActionListener {
    private JButton displayAllItem;
    private JButton addItem;
    private JButton saleItem;
    private JButton deletItem;
    private JTextArea theArea;
    private Meal m=new Meal();

    
    //====== the main frame ======
      
    public frame(){
      
   setTitle("The Restrunt Application ");
        setBounds(400, 50, 650, 600);
        
        
        
     // =======ltems=========

        
       
 food f1=new food(1,"checken","mshoy",50,900);
        food f2=new food(2,"egg","sandwish",60,100);
        food f3=new food(3,"ships","sandwish",70,90);
        food f4=new food(4,"ships","nfer",80,200);
        food f5=new food(5,"checken","prost",90,950);
        food f6=new food(6,"fasolia","nfer",100,300);
  
   m.addtheItem(f1);
   m.addtheItem(f2);
   m.addtheItem(f3);
   m.addtheItem(f4);
   m.addtheItem(f5);
   m.addtheItem(f6);

   
   
drink d1=new drink(7,"coffee","milk",50,50);
        drink d2=new drink(8,"juice","milk",60,80);
        drink d3=new drink(9,"juice","apple",70,90);
        drink d4=new drink(10,"juice","kpatchino",80,200);
        drink d5=new drink(11,"juice","limon",90,100);
        drink d6=new drink(12,"juice","mango",100,150);

   m.addtheItem(d1);
   m.addtheItem(d2);
   m.addtheItem(d3);
   m.addtheItem(d4);
   m.addtheItem(d5);
   m.addtheItem(d6);
   
   

   getContentPane().setLayout(new BorderLayout());
   



//A===========add action button=========
  
   
        
        
  displayAllItem= new JButton("All Items");
  displayAllItem.addActionListener(this);
        
        addItem = new JButton("Add Item");
        addItem.addActionListener(this);
        
        
        deletItem = new JButton("delet Item");
        deletItem.addActionListener(this);
        
        saleItem = new JButton("sale Item");
        saleItem.addActionListener(this);



//B===========add button to frame=========
  

   JPanel pan = new JPanel();

    pan.add(displayAllItem);
    pan.add(addItem);
    pan.add(deletItem);
    pan.add(saleItem);

        
        
        
//C===========add place of frame=========
  
        
    getContentPane().add("South", pan);

        JPanel SouthPanel = new JPanel();


        theArea = new JTextArea("\tWelcome to Rusterunet\t\t\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        JScrollPane scrollPane;
  scrollPane = new JScrollPane(theArea);
        SouthPanel.add(scrollPane);

        getContentPane().add("Center", SouthPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    
    
    
    
//D===========if you cleck button =========
  

public void actionPerformed(ActionEvent in){
  
  //1====cleck display All=====
  
   if (in.getSource() == displayAllItem) {
     
  theArea.setText("Display  all Items: \n"+m.displayAllItem());
        }
        
        //2=====cleck add Item=====
          
    else if (in.getSource() == addItem) {

   
  addItemFrame ad = new addItemFrame("Frame:Add Item", this);
  
   ad.setVisible(true);
     Item i = ad.getTheItem();

        if ( i != null)
 theArea.setText( m.addtheItem(i)+"\n"+m.displayAllItem());



        }
        
     //3======= cleck delete Item=====
        
    else if (in.getSource() == deletItem ) {
      
   //theArea.setText( "Delete Item:\n" );
   
  DeleteItem de = new DeleteItem("Frame:Delete Item", this);
  
   de.setVisible(true);
    int N = de.getItemDel();
     
        if ( N != 0){
            
    m.deletItem(N);
    theArea.setText(m.deletItem(N)+"\n"+ m.displayAllItem() );
        
            }
            
            else
            
    theArea.setText( "error!!...Try Agean." );


        }
        
        
        
//4=========cleck sale Item=========
       
          
      else if (in.getSource() == saleItem ) {
      
   theArea.setText( "Saling Item:\n" );
   SaleItem sa = new SaleItem("Frame:Sale Item", this);
  
     sa.setVisible(true);
    int it = sa.getSoldNo();
    int am=sa.getAmountNo();
     
        if ( it != 0 && am!=0){
          
    theArea.setText( m.SaleItem(it,am) );
         
            }
         
            
       else
            
    theArea.setText( "error!... Try Agean." );


        }
        
        
        
    }
    
    //==========main==========
      // public static void main(String args[]) {new frame();}


}
