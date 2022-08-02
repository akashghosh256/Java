
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;

	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(icon);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-10, label.getY()); //left
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-10);  //up
				break;
			case 's': label.setLocation(label.getX(), label.getY()+10);  //down
				break;
			case 'd': label.setLocation(label.getX()+10, label.getY());  //right
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		// for arrow keys, use getKeyCode() , they don't have name so we use key number
        
        switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY()); //left
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);  //up
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());  //right
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);  //down
			break;
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar()); // prints the key char
		System.out.println("You released key code: " + e.getKeyCode()); // prints the key code
	}
}

public class KEY_LISTENER{

	public static void main(String[] args) {
			
		new MyFrame();
	}
}