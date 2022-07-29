
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
}


class MyPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	//Image backgroundImage;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("monster.png").getImage();	
		//backgroundImage = new ImageIcon("space.png").getImage();
		timer = new Timer(10, this);  // create a timer with a delay of 10 ms
		timer.start();    // start the timer
	}

	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		
		Graphics2D g2D = (Graphics2D) g; // cast to Graphics2D
		
		//g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // called every 10 milliseconds
		
		if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) { // if the enemy hits the edge of the panel
			xVelocity = xVelocity * -1;  // reverse the x velocity
		}
		x = x + xVelocity;  // update the x position
		
		if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0) { // if the enemy hits the edge of the panel
			yVelocity = yVelocity * -1;  // reverse the y velocity
		}
		y = y + yVelocity;   // update the y position
		repaint();
	}
}



public class ANIMATON_TWO_D {

	public static void main(String[] args) {
			
		new MyFrame();
		
	}
}