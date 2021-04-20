package JavaA.restrunte;
  
  
  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;


public class DeleteItem extends JDialog implements ActionListener{
  
  
  
    private JButton delete;
    private JButton cancel ;
    private JTextField ItemNoDel;
    
    private int  ItemNo;
   // private Meal m=new Meal();
  
   public DeleteItem(String Title, JFrame owner){
      
    super (owner,Title, true);
        
    setLayout(new FlowLayout());
    setBounds(500,200,370,250);
        
     add (new JLabel("Item NO to Delete:    "));
     ItemNoDel = new JTextField(20) ;
     add (ItemNoDel);



       add (new JLabel("يجب ان تدخل رقم الصنف الراد حذفة "));
       add (new JLabel("\n"));
         delete= new JButton("delete");
        delete.addActionListener(this);
        add(delete);
        
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        add(cancel);
    }
  
  
  public int getItemDel(){
        return ItemNo;
    }

  public void actionPerformed(ActionEvent in){
      Meal v=new Meal();
        if (in.getSource() == delete){

        ItemNo=Integer.parseInt(ItemNoDel.getText());
      if(ItemNo>v.ItemNum||ItemNo<0)
          JOptionPane.showMessageDialog(null,v.ItemNum+"العنصر غير موجود!","Error Message",JOptionPane.ERROR_MESSAGE);


      else if(ItemNo<v.ItemNum&&ItemNo>0)
          ItemNo=Integer.parseInt(ItemNoDel.getText());

            else
          JOptionPane.showMessageDialog(null, "الرجاء ادخال رقم!","Error Message",JOptionPane.ERROR_MESSAGE);


      }
        else if (in.getSource() == cancel)
            ItemNo= 0;

        dispose();
    }

  
  
  
  
}
