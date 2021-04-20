package JavaA.restrunte;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;


public class addItemFrame extends JDialog implements ActionListener{
  
  
  
    private JButton OK;
    private JButton cancel ;
    private JTextField choseDorF;
    private JTextField ItemNumber;
    private JTextField ItemName;
    private JTextField ItemType;
    private JTextField ItemAmount;
    private JTextField ItemPrice;
 
   private Item theItem;
    
  
   public addItemFrame(String FrameTitle, JFrame owner){
      
    super (owner, FrameTitle, true);
        
    setLayout(new FlowLayout());
    setBounds(400,200,400,300);
        
        
     add (new JLabel("drink or food: "));
    choseDorF = new JTextField(20) ;
     add (choseDorF);
        
     add (new JLabel("Item Number:  "));
     ItemNumber = new JTextField(20) ;
     add (ItemNumber);
     
     add (new JLabel("Item Name:     "));
     ItemName = new JTextField(20) ;
     add (ItemName);
     
     add (new JLabel("Item Type:     "));
    ItemType = new JTextField(20) ;
    add (ItemType);
        
     add (new JLabel("Item Amount:   "));
        ItemAmount = new JTextField(20) ;
        add (ItemAmount);
        
     add (new JLabel("Item Price:    "));
        ItemPrice= new JTextField(20) ;
        add (ItemPrice);
        
        
        add (new JLabel("\nادخل كل القيم\n"));
         OK= new JButton("Add");
        OK.addActionListener(this);
        add(OK);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        add(cancel);
    }
  
  
 

  public void actionPerformed(ActionEvent in){


        if (in.getSource() == OK){

            int number=Integer.parseInt(ItemNumber.getText());
            String choseing= choseDorF.getText();
            String name=ItemName.getText();
            String type= ItemType.getText();
            int amount=Integer.parseInt(ItemAmount.getText());
            float price=Integer.parseInt(ItemPrice.getText());
 


if(choseing.equals("")|| number==0||type.equals("")||amount==0||price==0||name.equals(""))
    JOptionPane.showMessageDialog(null,"الرجاء ادخال كل القيم!","Error Message",JOptionPane.ERROR_MESSAGE);
     
  else if(choseing.equals("drink")&&number>0&&!type.equals("")&&amount>0&&price>0&&!name.equals(""))
         theItem =  new drink(number,name,type,amount,price);
         
   else if(choseing.equals("food")&&number>0&&!type.equals("")&&amount>0&&price>0&&!name.equals(""))
         theItem =  new food(number,name,type,amount,price);

        }
        
        else if (in.getSource() == cancel)
        {
            

            theItem= null;

        }
        dispose();
    }

    public Item getTheItem() {
        return theItem;
    }
}



