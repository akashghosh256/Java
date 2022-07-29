import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("D:/my download folder/cross.png");
        // cross icon image if checkbox is not checked
		checkIcon = new ImageIcon("D:/my download folder/tick.png");
        // tick icon image if checkbox is checked
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);  // add action listener to button to call actionPerformed method
		
		checkBox = new JCheckBox();  
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(xIcon);  // set icon to x icon in the beginning
		checkBox.setSelectedIcon(checkIcon);  // set icon to tick icon when checkbox is checked
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
    // action performed method is called automatically when button is clicked
    // button.addActionListener(this); this line helps to call actionPerformed method
	public void actionPerformed(ActionEvent e){ 

		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}

	}
}


public class CHECKBOX {

	public static void main(String[] args) {
	
		// JCheckBox = A GUI component that can be selected or deselected
		
		new MyFrame();

	}
}