package myproject;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Keylistener extends JFrame implements KeyListener{

	JLabel label;
	JLabel label1;
	
	Keylistener(){
		this.setTitle("Rocket");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("exclamation-mark.png");
		
//		button = new JButton("back to main");
//		button.addKeyListener(this);
//		button.setFocusable(false);
//		button.setPreferredSize(new Dimension(200,200));
		
		label = new JLabel();
		label.setBounds(440/2,400/2,100,100);
		label.setIcon(icon);
		
		label1 = new JLabel();
		label1.setBounds(440/2,400/2,100,100);
		label1.setIcon(icon);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		this.add(label);
		this.add(label1);
		this.setSize(520,520);
		this.addKeyListener(this);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.setVisible(true);
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	  
		switch(e.getKeyChar()) {
		case 'w' : label1.setLocation(label1.getX(),label1.getY()-10);
		ImageIcon icon1 = new ImageIcon("up-arrow.png");
		label1.setIcon(icon1);
		break;
		case 's' : label1.setLocation(label1.getX(),label1.getY()+10);
		ImageIcon icon2 = new ImageIcon("down-arrow.png");
		label1.setIcon(icon2);
		break;
		case 'd' : label1.setLocation(label1.getX()+10,label1.getY());
		ImageIcon icon3 = new ImageIcon("right-arrow.png");
		label1.setIcon(icon3);
		break;
		case 'a' : label1.setLocation(label1.getX()-10,label1.getY());
		ImageIcon icon4 = new ImageIcon("left-arrow.png");
		label1.setIcon(icon4);
		break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==37) {
			ImageIcon icon = new ImageIcon("left-arrow.png");
			label.setLocation(label.getX()-10,label.getY());
			label.setIcon(icon);
			
			
		}
		else if(e.getKeyCode()==39) {
			ImageIcon icon = new ImageIcon("right-arrow.png");
			label.setLocation(label.getX()+10,label.getY());
			label.setIcon(icon);
		}
		else if(e.getKeyCode()==38) {
			ImageIcon icon = new ImageIcon("up-arrow.png");
			label.setLocation(label.getX(),label.getY()-10);
			label.setIcon(icon);
		}
		else if(e.getKeyCode()==40) {
			ImageIcon icon = new ImageIcon("down-arrow.png");
			label.setLocation(label.getX(),label.getY()+10);
			label.setIcon(icon);
		}
		else if(e.getKeyCode()==27) {
			this.dispose();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("you pressed key char: "+e.getKeyChar());
		System.out.println("you pressed key code: "+e.getKeyCode());
		
	}


}
