
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("D:/my download folder/thumbsup2.png");
		ImageIcon icon2 = new ImageIcon("C:/Users/HP/Pictures/demo-image.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 450, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 280, 280);
		button.addActionListener(this);
		button.setText("I'm a button!");
		
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
    // actionPerformed() is a method that is called when a button is clicked on

		if(e.getSource()==button) {
            // e.getSource() is a method that returns the object that triggered the event
			System.out.println("poo");
			button.setEnabled(false);  // this enables the button to be clicked only once
			label.setVisible(true);
		}	
	}
}


public class JBUTTONS{

	public static void main(String[] args) {

		// JButton = a button that performs an action when clicked on
			
		new MyFrame();

	}
}