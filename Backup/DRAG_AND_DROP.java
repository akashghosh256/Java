import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

class DragPanel extends JPanel{

    ImageIcon image = new ImageIcon("rocket.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel(){
        imageCorner = new Point(0, 0);
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentpt = e.getPoint();
            
            imageCorner.translate(
                (int)(currentpt.getX() - prevPt.getX()),
                 (int)(currentpt.getY() - prevPt.getY())   
                 );

            prevPt = currentpt;
            repaint();
        }
    }



}

class MyFrame extends JFrame{
    DragPanel dragPanel;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLayout(null);
        dragPanel = new DragPanel();
        //dragPanel.setBounds(0, 0, 500, 500);
        this.add(dragPanel);
        this.setVisible(true);
    }
}


public class DRAG_AND_DROP {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

