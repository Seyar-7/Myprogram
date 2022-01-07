import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flowlayout {

	public static void main(String[] args) {
		
		/*
		  Layout Manager = Defines the natural layout for components within a container.
		  
		  FlowLayout = Place components in a row , sized at their preferred size,
		               if the horizontal space in the container in too small,
		               the FlowLayout class uses the next available row.
		 */
		
		JFrame frame = new JFrame();
	 	JPanel panel = new JPanel();
		
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        panel.setBackground(new Color(123,50,250));
        panel.setPreferredSize(new Dimension(250,250));
        panel.setVisible(true);
        panel.setLayout(new FlowLayout());
        
       
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        
        frame.add(panel);
        frame.setVisible(true);
        
	}

}
