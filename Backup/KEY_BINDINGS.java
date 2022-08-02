
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Game {
    // declare variables

	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	Game(){
	
		frame = new JFrame("KeyBinding Demo"); // create a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();  // create an action
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction"); // add an action to the key binding
		label.getActionMap().put("upAction", upAction);  // add the action to the action map
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction"); // add an action to the key binding
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{
        // create an action

		@Override
		public void actionPerformed(ActionEvent e) {
            // Invoked when an action occurs.
			label.setLocation(label.getX(), label.getY()-10);  //up
		}		
	}
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);	//down
		}		
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10, label.getY());	//left
		}		
	}
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10, label.getY());   //right
		}		
	}
}

public class KEY_BINDINGS {
   
    public static void main(String[] args ){

    	// Key Bindings = 	bind an Action to a KeyStroke
    	//					don't require you to click a component to give it focus
    	//					all Swing components use Key Bindings
    	//					increased flexibility compared to KeyListeners
    	//					can assign key strokes to individual Swing components
    	//					more difficult to utilize and set up :(
    		
    	Game game = new Game();
    }
}