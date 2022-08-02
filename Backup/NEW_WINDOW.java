
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class LaunchPage implements ActionListener{
    // ActionListener = interface that defines the actionPerformed method
 
 JFrame frame = new JFrame();
 JButton myButton = new JButton("New Window");
 
 LaunchPage(){
  
  myButton.setBounds(100,160,200,40);
  myButton.setFocusable(false);   // prevent button from being focused, not necessary sometimes the button get 
  // highligthed, which is sometimes annoying
  myButton.addActionListener(this);
  
  frame.add(myButton);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) { 

    // when button is clicked
    // ActionEvent = event that occurs when a button is clicked
  
  if(e.getSource()==myButton) {
   frame.dispose();
   NewWindow myWindow = new NewWindow();
  }
 }
}


class NewWindow {

 JFrame frame = new JFrame();
 JLabel label = new JLabel("Hello Bro Code!");
 
 NewWindow(){
  
  label.setBounds(0,0,100,50);
  label.setFont(new Font(null,Font.PLAIN,25));
  
  frame.add(label);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
 }
}

public class NEW_WINDOW {

    public static void main(String[] args) {
     
     LaunchPage launchPage = new LaunchPage();
   
    }
   }