package JavaA.restrunte;

        import java.awt.*;
        import java.awt.event.*;
import javax.swing.*;


/**
 * Created by Dell on 25/03/2020.
 */
public  class PassWord  extends JFrame implements ActionListener {
    private JButton Enter;
    private JButton concel;

    private JTextField UserName;
    private JPasswordField PassWordd;

    public PassWord(){
        setTitle("The Login User ");
        setBounds(400, 200,300,150);

        Enter= new JButton("Enter");
        Enter.addActionListener(this);

        getContentPane().setLayout(new BorderLayout());

        concel = new JButton("Concel");
        concel.addActionListener(this);

        JPanel pan = new JPanel();

        UserName = new JTextField(15) ;
        PassWordd = new JPasswordField(15) ;

        pan.add (new JLabel("User Name:   "));
        pan.add(UserName);

        pan. add (new JLabel("PassWord:    "));
        pan.add (PassWordd);
        pan.add(Enter);
        pan.add(concel);



        getContentPane().add("Center", pan);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent in) {



        if (in.getSource() == Enter) {

            String Name = UserName.getText();

            String Pass =PassWordd.getText();

             if(Name.equals("")||Pass.equals(""))
            JOptionPane.showMessageDialog(null, " الرجاء ادخال كل القيم!", "Error Message", JOptionPane.ERROR_MESSAGE);
           else if (Name.equals("Anwar2") && Pass.equals("1233")) {
                frame ad = new frame();

                ad.setVisible(true);
            }
             else if (!Pass.equals("1233") &&!Name.equals("Anwar2"))
                 JOptionPane.showMessageDialog(null, " اسم المستخدم و كلمة السر غير صحيحتين!", "Error Message", JOptionPane.ERROR_MESSAGE);


             else if (!Name.equals("Anwar2"))
                JOptionPane.showMessageDialog(null, " اسم المستخدم غير صحيح!", "Error Message", JOptionPane.ERROR_MESSAGE);

            else if (!Pass.equals("1233"))
                JOptionPane.showMessageDialog(null, " كلمة السر غير صحيحة!", "Error Message", JOptionPane.ERROR_MESSAGE);


        }
         else if (in.getSource() == concel)
            dispose();


    }

    public static void main(String args[])
    {
        new PassWord();
    }

}
