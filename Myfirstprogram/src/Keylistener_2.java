import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Keylistener_2 extends JFrame implements KeyListener{

	JLabel label;
	
	Keylistener_2(){
	
		ImageIcon icon = new ImageIcon("midle finger.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		this.add(label);
		this.getContentPane().setBackground(Color.BLACK);
		this.addKeyListener(this);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	  //KeyTyped = Invoked when a key is typed. Uses KeyChar, Char output
		
		switch(e.getKeyChar()) {
		case 'w': label.setLocation(label.getX(),label.getY()-10);
		break;
		case 's': label.setLocation(label.getX(),label.getY()+10);
		break;
		case 'a': label.setLocation(label.getX()-10,label.getY());
		break;
		case 'd': label.setLocation(label.getX()+10,label.getY());
		break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	  // KeyPressed = Invoked when physical key is pressed down. Uses KeyCode, int output
		
	         if(e.getKeyCode()==38) {
			label.setLocation(label.getX(),label.getY()-10);
		}
		else if(e.getKeyCode()==39) {
		    label.setLocation(label.getX()+10,label.getY());
		}
			
		else if(e.getKeyCode()==40) {
			label.setLocation(label.getX(),label.getY()+10);
		}
		    
		else if(e.getKeyCode()==37) {
			label.setLocation(label.getX()-10,label.getY());
		}
		
}	
	

	@Override
	public void keyReleased(KeyEvent e) {
	 // KeyReleased = Called whenever a button is released
		//System.out.println("you released key char: "+e.getKeyChar());
		System.out.println("You released key code: "+e.getKeyCode());
		
	}

}
