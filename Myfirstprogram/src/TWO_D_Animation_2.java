import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TWO_D_Animation_2 extends JPanel implements ActionListener{
	JButton button;
	final int panel_width = 650;
	final int panel_height = 500;
	int timers = 10;
	Image img;
	Image background;
	Timer timer;
	int xvelocity = 10;
	int yvelocity = 15;
	int x = 0;
	int y = 0;

	TWO_D_Animation_2(){
		
		this.setPreferredSize(new Dimension(panel_width,panel_height));
		this.setBackground(Color.BLACK);
		
		img = new ImageIcon("fun.png").getImage();
		background = new ImageIcon("earth.jpg").getImage();
		
		button = new JButton("click");
		button.addActionListener(this);
		button.setBounds(0,0,100,100);
		this.add(button);
	
	    
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;	
	
		g2d.drawImage(background,0,0,null);
        g2d.drawImage(img,x,y,null);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
        	
        	if(x>=panel_width - img.getWidth(null) || x<0) {
        		xvelocity = xvelocity * -1;
        		
        	}
        	else if( y>=panel_height - img.getWidth(null) || y<0) {
        		yvelocity = yvelocity * -1;	
        	}
		x = x + xvelocity;
		y = y + yvelocity;
		repaint();
		
	   }
	}

}
