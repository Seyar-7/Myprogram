import java.awt.Graphics;

import javax.swing.JFrame;

public class TWO_D__Graphics_1 extends JFrame{
	
	TWO_D__Graphics_2 panel;
	
	TWO_D__Graphics_1(){
		
		panel = new TWO_D__Graphics_2();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(500,500);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

}
