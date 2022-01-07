import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow_3{
	//NewWindow_2 button = new NewWindow_2();

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	 NewWindow_3(){
		  
		 
		 label.setText("FUCK OFF!!!!!");
		 label.setBounds(0,0,200,50);
		 label.setFont(new Font(null,Font.PLAIN,25));
		 
		 frame.add(label);
		// frame.add(button.button);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(500,500);
		 frame.setLayout(null);
		 frame.setVisible(true);

	}
}
