package JavaA.restrunte;

/**
 * Created by Dell on 25/03/2020.
 */




    /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
//import static java.lang.System.in;
import javax.swing.*;

//public static void main(String[]args){


    public class Try9  {
        static private JFrame frame = new JFrame("GUI APPLICATION");

        static private JLabel label2= new JLabel("General Information's");
        static private JLabel label3= new JLabel("Name");
        static private  JTextField textField = new JTextField();
        static private JLabel label4= new JLabel("ID");
        static private JTextField textField2 = new JTextField();
        static private JLabel label5= new JLabel ("program");
        static private JLabel label6 = new JLabel("Level");
        static private JLabel labelResult1 = new JLabel();
        static private JCheckBox checkbox2 = new JCheckBox("First");
        static private JCheckBox checkbox3 = new JCheckBox("Second");
        static private JLabel label = new JLabel();
        static private JRadioButton radioButton_1 = new JRadioButton("SXE", true);
        static private JLabel label1 = new JLabel("sex");
        static private JRadioButton radioButton_2 = new JRadioButton("MALE");
        static private JRadioButton radioButton_3 = new JRadioButton("FEMALE");
        static private JLabel labelResult = new JLabel();
        static private JLabel labelResult2 = new JLabel();
        static private JLabel labelResult3 = new JLabel();
        static private JLabel labelResult4 = new JLabel();
        static private JButton button = new JButton("SAVE");
        JColorChooser CGrean=new JColorChooser(Color.green);

        static   private JButton button2 = new JButton("CANCEL");
        public  static void main(String[] args) {
            ButtonGroup group = new ButtonGroup();
//group.add(radioButton_1);

            group.add(radioButton_2);
            group.add(radioButton_3);
            String[] items={"","diploma","bachelor"};
            JComboBox combobox=new JComboBox(items);
            label2.setBounds(200 , -80 , 300, 200);
            label3.setBounds(40, 40, 100, 30);
            textField.setBounds(100, 40, 200, 35);
            label4.setBounds(40, 80, 100, 30);
            textField2.setBounds(100, 80, 200, 35);
            label5.setBounds(40, 120, 100, 30);
            combobox.setBounds(100, 120, 200, 35);
            label6.setBounds(100, 200, 200, 35);
            labelResult1.setBounds(350, 200, 180, 35);
            checkbox2.setBounds(150, 200, 80, 35);
            checkbox3.setBounds(250, 200, 80, 35);
            checkbox2.setBackground(Color.BLUE);
            checkbox3.setBackground(Color.BLUE);
            labelResult2.setBounds(350, 40, 180, 35);
            labelResult3.setBounds(350, 80, 180, 35);
            labelResult4.setBounds(350, 120, 180, 35);
            label.setBounds(40, 10, 150, 30);
//radioButton_1.setBounds(40, 40, 100, 30);
            label1.setBounds(100, 160, 200, 35);
            radioButton_2.setBounds(150, 160, 80, 35);
            radioButton_3.setBounds(250, 160, 100, 35);
            radioButton_2.setBackground(Color.cyan);
            radioButton_1.setBackground(Color.cyan);
            radioButton_3.setBackground(Color.cyan);
            button.setBounds(150, 300, 170, 35);
            button.setFont(Font.getFont("9"));
            button.setBackground(Color.GREEN);
            button2.setBounds(350, 300, 170, 35);
            button2.setBackground(Color.red);
            labelResult.setBounds(350, 160, 180, 35);



            frame.add(label);
            frame.add(label2);
            frame.add(label3);
            frame.add(textField);
            frame.add(label4);
            frame.add(textField2);
            frame.add(combobox);
            frame.add(label5);
            frame.add(label6);
            frame.add(labelResult1);
            frame.add(checkbox2);
            frame.add(checkbox3);
//frame.add(radioButton_1);
            frame.add(label1);
            frame.add(radioButton_2);
            frame.add(radioButton_3);
            frame.add(button);
            frame.add(button2);
            frame.add(labelResult);
            frame.add(labelResult2);
            frame.add(labelResult3);
            frame.add(labelResult4);
            frame.setSize(600, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(null);
            frame.setVisible(true);

            ActionListener action_1= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if(radioButton_2.isSelected())
                        labelResult.setText("Your six is: "+radioButton_2.getText());
                    else if(radioButton_3.isSelected())
                        labelResult.setText("Your six is: "+radioButton_3.getText());
else if(radioButton_3.isSelected())
labelResult.setText("You language is: "+radioButton_3.getText());
                }
            };
            ActionListener action_2= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if(checkbox2.isSelected())
                        labelResult1.setText("Your level is: "+checkbox2.getText());
                    else if(checkbox3.isSelected())
                        labelResult1.setText("Your level is: "+checkbox3.getText());
//else if(radioButton_3.isSelected())
//labelResult.setText("You language is: "+radioButton_3.getText());
                }
            };
            ActionListener action_3= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    labelResult2.setText("Your name is: "+textField.getText());
                }
            };
            ActionListener action_4= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    labelResult3.setText("Your Id is: "+textField2.getText());
                }
            };
            ActionListener action_5= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    labelResult4.setText("Your program is: "+combobox.getSelectedItem());
                }
            };
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){


                    if (textField.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "ادخل الاسم نص ","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    if (textField.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "يجب ادخال الاسم","Error Message",JOptionPane.ERROR_MESSAGE);
                    }else if (textField2.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "يجب ادخال الرقم التعريفي ","Error Message",JOptionPane.ERROR_MESSAGE);

                    }else  if( textField2.getText().matches("\\d+") ) {
                        // it is
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "يجب ادخال الرقم التعريفي بشكل صحيح ","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            ActionListener action_6= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showConfirmDialog(null,
                            "You are going to delete you history.\nAre you sure?",
                            "Delete History",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                }
            };
            button.addActionListener(action_1);
            button.addActionListener(action_2);
            button.addActionListener(action_3);
            button.addActionListener(action_4);
            button.addActionListener(action_5);
            button2.addActionListener(action_6);

        }

        }






