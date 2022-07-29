import java.awt.Color;            // import the Color class
import java.awt.Font;             // import the Font class
import javax.swing.BorderFactory; // import the BorderFactory class
import javax.swing.ImageIcon;     // import the ImageIcon class
import javax.swing.JFrame;        // import the JFrame class
import javax.swing.JLabel;        // import the JLabel class
import javax.swing.border.Border; // import the Border class

public class JLABEL {

	public static void main(String[] args) {

		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("D:/my download folder/demo-image.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
			
		JFrame frame = new JFrame();  //create a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close window when X is clicked
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);	 //set frame to visible
		frame.add(label);  // TO ADD THE LABEL TO THE FRAME

		frame.pack();  //pack the frame to fit the label
        // ALWAYS USE PACK AT LAST, IT ADJUST WINDOW ACCORDING TO PICTURE
	}
}