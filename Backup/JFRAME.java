import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;


// SIMPLE WINDOW 
class MyFrame extends JFrame{

    MyFrame(){
        this.setTitle(":) Title of window ");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("D:/my download folder/demo-image.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }
}

public class JFRAME {
    public static void main(String[] args) {
        
        // You van any of the two no issues
        //MyFrame myframe = new MyFrame();  
        new MyFrame();


    }
}
