import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;

class MyFrame extends JFrame implements ActionListener{

JComboBox comboBox;
 
MyFrame(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout()); 
  
  String[] animals = {"dog","cat","bird"};
  
  comboBox = new JComboBox(animals);
  comboBox.addActionListener(this);
  
  //comboBox.setEditable(true);
  //System.out.println(comboBox.getItemCount());
  //comboBox.addItem("horse");
  //comboBox.insertItemAt("pig", 0);
  //comboBox.setSelectedIndex(0);
  //comboBox.removeItem("cat");
  //comboBox.removeItemAt(0);
  //comboBox.removeAllItems();
  
  this.add(comboBox);
  this.pack();
  this.setVisible(true);
 }
 

 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==comboBox) {
   System.out.println(comboBox.getSelectedItem());
   //System.out.println(comboBox.getSelectedIndex());
  }
 }
}


public class JCOMBO_BOXES {

    public static void main(String[] args) {
        
         // JComboBox = A component that combines a button or editable field and a drop-down list
         
         new MyFrame();
       
     }
}

/*
If it shows error no need to panic
 * Note: Recompile with -Xlint:deprecation for details.

It simply tells you the option to use when compiling to get more details about where you are using deprecated stuff.
 */