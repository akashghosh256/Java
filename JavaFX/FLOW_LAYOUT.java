
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FLOW_LAYOUT {
    public static void main(String[] args) {
        
        // Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.
		
	JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation of frame to exit on close
    frame.setSize(500,500);
    
    frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));  // set layout of frame




    frame.add(new JButton("1"));    // add button to frame
    frame.add(new JButton("2"));
    frame.add(new JButton("3"));
    frame.add(new JButton("4"));
    frame.add(new JButton("5"));
    frame.add(new JButton("6"));
    frame.add(new JButton("7"));
    frame.add(new JButton("8"));
    frame.add(new JButton("9"));

    frame.setVisible(true);     // set frame to visible



    }
}
