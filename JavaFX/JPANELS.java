
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPANELS {

	public static void main(String[] args) {

		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("D:/my download folder/demo-image.png/thumbsup.png");
		
		JLabel label = new JLabel();
		label.setText("Hi.....................");   //set text of label
		label.setIcon(icon);                   //set image of label
		label.setVerticalAlignment(JLabel.TOP);    //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.LEFT);    //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 75, 75);
		
		JPanel redPanel = new JPanel();    // create a panel
		redPanel.setBackground(Color.red);  // set background color of panel
		redPanel.setBounds(0, 0, 250, 250); //set x,y position within frame as well as dimensions
		redPanel.setLayout(new BorderLayout());  // set layout of panel
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);	
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}