
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File(".")); //sets current directory
			
			int response = fileChooser.showOpenDialog(null);  //shows file chooser 
            //select file to open
			//int response = fileChooser.showSaveDialog(null); //select file to save
			
			if(response == JFileChooser.APPROVE_OPTION){  // if file is selected

				File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //get file path
				System.out.println(file);
			}
		}
	}
}

public class FILE_CHOOSER{

	public static void main(String[] args) {
	
		// JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
		
		new MyFrame();
	}
}