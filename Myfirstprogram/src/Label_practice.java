
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Label_practice {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Border border = BorderFactory.createLineBorder(new Color(123,50,250),5);
		ImageIcon image = new ImageIcon("the last of us part II.jpg");
		
		JLabel label = new JLabel();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("do you want play this game\nType 'play'\nIf you dont want to play just type any word");
		String play = scan.next();
		
		
	   if(play.equalsIgnoreCase("play"))
	   {
		label.setIcon(image);
		label.setText("GAME OF THE YEAR 2020");
		label.setForeground(Color.green);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setBackground(Color.black);
		label.setFont(new Font("mv boli",Font.BOLD,80));
		label.setOpaque(true);
		label.setIconTextGap(-30);
		label.setBorder(border);
		//label.setBounds(100, 100, 255, 255);
	   }
		
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1200,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("THE LAST OF US PART II");
		//frame.setLayout(null);
		frame.add(label);
        frame.pack();
        
        new JLable_practice_2();
        
	}

}
