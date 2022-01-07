import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouselistener_2 extends JFrame implements MouseListener{
	
	JLabel label;
    ImageIcon smile;
    ImageIcon think;
    ImageIcon nauseated;
    ImageIcon vomiting;
	
	Mouselistener_2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(520,520);
		this.setLayout(null);
		
		smile = new ImageIcon("smiling-face.png");
		think = new ImageIcon("thinking-face.png");
		nauseated = new ImageIcon("nauseated-face.png");
		vomiting = new ImageIcon("face-vomiting.png");
		
		
		label = new JLabel();
		label.setBounds(440/2,400/2,100,100);
		label.setIcon(smile);
	
		//label.setBackground(Color.RED);
		//label.setOpaque(true);
//		label.addMouseListener(this);
		
		this.addMouseListener(this);
		this.getContentPane().setBackground(Color.BLACK);
		this.add(label);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//Invoked when the mouse button has been clicked (pressed and released) on a component.
//		System.out.println("you clicked the mouse ");
//		label.setBackground(Color.cyan);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//Invoked when a mouse button has been pressed on a component.
//		System.out.println("you pressed the mouse ");
//		label.setBackground(Color.blue);
		label.setIcon(nauseated);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//Invoked when a mouse button has been released on a component.
//		System.out.println("you released the mouse ");
//		label.setBackground(Color.green);
		label.setIcon(vomiting);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Invoked when the mouse enters a component.
//		System.out.println("you Entered the component ");
//		label.setBackground(Color.gray);
		label.setIcon(think);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Invoked when the mouse exits a component.
//		System.out.println("you Exit the component ");
//		label.setBackground(Color.red);
		label.setIcon(smile);
	}

}
