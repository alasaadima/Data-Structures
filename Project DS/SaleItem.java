package JavaA.restrunte;

  
  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;


public class SaleItem extends JDialog implements ActionListener{
  
  
  
    private JButton sale;
    private JButton cancel ;
    private JTextField ItemNo;
    private JTextField SoldAmount;
    private Item theSoldItem;
    private int ReNo,ReAmount;
  
   public SaleItem(String FTitle, JFrame owner){
      
    super (owner, FTitle, true);
        
    setLayout(new FlowLayout());
    setBounds(500,200,370,250);
        
     add (new JLabel("Sold Item No:    "));
     ItemNo = new JTextField(3) ;
     add (ItemNo);
     
     add (new JLabel("Sold Amount:     "));
     SoldAmount= new JTextField(3) ;
     add (SoldAmount);
     
        
        add (new JLabel("\nيجب ادخال رقم الصنف والكمية المراد بيعها"));
         sale= new JButton("sale");
        sale.addActionListener(this);
        add(sale);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        add(cancel);
    }
  
  
  public int getSoldNo(){
        return ReNo ;
    }

 public int getAmountNo(){
        return ReAmount;
    }

  public void actionPerformed(ActionEvent in){
    
        if (in.getSource() == sale){
            // use the entered data
            
   
      
  int SoldNo=Integer.parseInt(ItemNo.getText());
  
 
  
  int soAmount=Integer.parseInt(SoldAmount.getText());
  
 

       

  ReNo=SoldNo;
  ReAmount=soAmount;
       
       
        }
        
        else if (in.getSource() == cancel)
        {
            
            ReNo=0;
            ReAmount=0;
        }
        dispose();
    }

  
  
  
}
