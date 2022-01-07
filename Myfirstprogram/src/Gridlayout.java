import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout {
          public static void main(String[] args) {
        	  
        	 /*
        	    Layout Manager = Defines the natural layout for components within a container.
        	    
        	    GridaLayout = places components in a grid of cells.
        	                  Each components takes all the available space within its cell,
        	                  And each cell is the same size.
        	  */
        	  
        	  JFrame frame = new JFrame("GridLayout");
        	  
        	  frame.setSize(500,500);
        	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	 // frame.setTitle("GridLayout");
        	  frame.setLayout(new GridLayout(3,3,10,10));//New GridLayout(rows,columns,setBorderLayoutHorizontal,setBorderLayoutvertical)
        	  
        	  
        	  frame.add(new JButton("1"));
        	  frame.add(new JButton("2"));
        	  frame.add(new JButton("3"));
        	  frame.add(new JButton("4"));
        	  frame.add(new JButton("5"));
        	  frame.add(new JButton("6"));
        	  frame.add(new JButton("7"));
        	  frame.add(new JButton("8"));
        	  frame.add(new JButton("9"));
        	  
        	  frame.setVisible(true);
        	  
        	  
          }
}
