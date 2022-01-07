import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borderlayout {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container.
		  
		//3 Common managers.
		
		//BorderLayout = A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST,CENTER.
		//               All extra space is placed in the center area.
		
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.black);
		panel5.setBackground(Color.magenta);
		
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//----------------sub Panel----------------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.LIGHT_GRAY);
		panel7.setBackground(new Color(123,50,250));
		panel8.setBackground(Color.yellow);
		panel9.setBackground(Color.darkGray);
		panel10.setBackground(Color.PINK);
		
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel5.setLayout(new BorderLayout(10,10));
		
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel8,BorderLayout.SOUTH);
		panel5.add(panel9,BorderLayout.EAST);
	    panel5.add(panel10,BorderLayout.WEST);
	    panel5.add(panel7,BorderLayout.CENTER);
			
	    
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.EAST);
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		
		
	}

}
