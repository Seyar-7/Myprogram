import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Layeredpane {

	public static void main(String[] args) {
		
		/*
		  JLayeredPane = Swing container that provides a 
		                 third dimension for positioning components
		                 EX. depth, Z-index
		 */
          
		JFrame frame = new JFrame("LayeredPane");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel();
		label1.setBounds(50,50,200,200);
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		
		JLabel label2 = new JLabel();
		label2.setBounds(100,100,200,200);
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		
		JLabel label3 = new JLabel();
		label3.setBounds(150,150,200,200);
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		
		

		JLayeredPane layeredpanel = new JLayeredPane();	
		layeredpanel.setBounds(0,0,500,500);
		
		layeredpanel.add(label1,Integer.valueOf(1));
		layeredpanel.add(label2,Integer.valueOf(2));
		layeredpanel.add(label3,Integer.valueOf(0));
		
		
		frame.add(layeredpanel);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setVisible(true);
	}

}
