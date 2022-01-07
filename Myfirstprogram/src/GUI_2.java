import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI_2 extends JFrame {
   
	GUI_2() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		
		this.setTitle("The Last Of Us Part II");// set title of this
		this.setSize(480,480);//Set the size of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); // Make this visible
		this.setResizable(false);
		
		ImageIcon image = new ImageIcon("the last of us.png");//create an image icon
		this.setIconImage(image.getImage());//change icon of image
		this.getContentPane().setBackground(new Color(133,32,66));//change the background color
		
		new GUI_3();
	    
	}
}
