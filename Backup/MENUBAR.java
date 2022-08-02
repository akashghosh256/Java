
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	//ImageIcon loadIcon;
	//ImageIcon saveIcon;
	//ImageIcon exitIcon;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		//loadIcon = new ImageIcon("load.png");
		//saveIcon = new ImageIcon("save.png");
		//exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");  //create a new menu called "File"
		editMenu = new JMenu("Edit");  //create a new menu called "Edit"
		helpMenu = new JMenu("Help");   //create a new menu called "Help"
		
		loadItem = new JMenuItem("Load");  //create a new menu item called "Load"
		saveItem = new JMenuItem("Save");   //create a new menu item called "Save"
		exitItem = new JMenuItem("Exit");   //create a new menu item called "Exit"
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		//loadItem.setIcon(loadIcon);
		//saveItem.setIcon(saveIcon);
		//exitItem.setIcon(exitIcon);
		

        //set the keyboard shortcut for the options
		fileMenu.setMnemonic(KeyEvent.VK_F);   // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
}

public class MENUBAR{

	public static void main(String[] args) {
	
		new MyFrame();
	}
}