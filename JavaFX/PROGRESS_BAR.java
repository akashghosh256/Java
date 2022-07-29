
import java.awt.*;
import javax.swing.*;

class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
			
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter =0;
		
		while(counter<=100) {
			
			bar.setValue(counter); //set the value of the progress bar, the moving bar
            
            bar.setString(counter+" / 100 HP"); //setString() is used to display the current HP and maximum HP
			
            
            try {
				Thread.sleep(50);  //sleep for 50 milliseconds
			} catch (InterruptedException e){
				e.printStackTrace();
			}

			counter +=1;
		}
		bar.setString(" Done! :)");
	}
}


public class PROGRESS_BAR{ 
  
  
    public static void main(String[] args) 
    { 
  
    	ProgressBarDemo demo = new ProgressBarDemo();
        
    } 
  
}