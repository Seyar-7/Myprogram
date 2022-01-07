
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {

	public static void main(String[] args) {
		
		//JLabel = a GUI display area for a string of text, an image,or both.
		ImageIcon image = new ImageIcon("the last of us.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();
	    label.setIcon(image);//Set image
	    label.setText("The world best game ever");//set text 
	    label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM of the imageicon
	    label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of the imageicon
	    label.setForeground(Color.GREEN);//set text color
	    label.setFont(new Font("mv boli",Font.PLAIN,50));//set font of text
	    label.setIconTextGap(-2);//set gap of text to image
	    label.setBorder(border);//set border line
	    label.setBackground(Color.black);//set background color
	    label.setOpaque(true);//set background color	    		
	    label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
	    label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
		//label.setBounds(100, 100, 270, 270);//set x,y position within frame as well as dimensions
			
		
		
		
		
		JFrame frame = new JFrame();
		//frame.setSize(500,500);
		frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
       // frame.setLayout(null);
        frame.pack();
	}

}
