package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_2 implements ActionListener{
	Audio audio;
    JButton button;
	GUI_2() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		button = new JButton("play");
		
		   button.setBounds(150,200,200,50);
 		   button.setFocusable(false);
 		   button.addActionListener(this);
	
		
		JFrame frame = new JFrame();
		   frame.setTitle("The Last Of Us Part II");
		   frame.setSize(480,480);
		   frame.add(button);
		   frame.setLayout(null);
		   frame.setVisible(true);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setResizable(false);
		   
		   ImageIcon image = new ImageIcon("the last of us.png");
		   frame.setIconImage(image.getImage());
		   frame.getContentPane().setBackground(new Color(193,25,233));
		   
		  // audio = new Audio();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==button) {
			  try {
				audio = new Audio();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  button.setVisible(false);
		  }
		
	}
}
