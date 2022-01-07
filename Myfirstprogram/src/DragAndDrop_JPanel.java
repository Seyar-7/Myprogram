import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragAndDrop_JPanel extends JPanel{

	ImageIcon image = new ImageIcon("smiling-face.png");
//	final int WIDTH = image.getIconWidth();
//	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevpt;
	
	
	
	DragAndDrop_JPanel(){
		
		imageCorner = new Point(0,0);
		ClickListener ClickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(ClickListener);
		this.addMouseMotionListener(dragListener);
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	 
	private class ClickListener extends MouseAdapter{
		     public void mousePressed(MouseEvent e) {
		    	 prevpt = e.getPoint();
		    	
;		     }
	}
	
	private class DragListener extends MouseMotionAdapter{
		    public void mouseDragged(MouseEvent e) {
		    	Point currentPt = e.getPoint();
		    	
		    	imageCorner.translate(
		    			
		    			(int)(currentPt.getX() - prevpt.getX()),
		    			(int)(currentPt.getY() - prevpt.getY())
		    			);
		    	prevpt = currentPt;
		    	repaint();
		    }
	}
	
}
