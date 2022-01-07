import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewWindow_2 implements ActionListener{
 
	JButton button;
	JFrame frame = new JFrame();
	
	NewWindow_2(){
		
		button = new JButton("Button");
		button.setBounds(150,150,200,50);
		button.setFont(new Font(null,Font.PLAIN,25));
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			 frame.dispose();
			
			 NewWindow_3 newwindow =  new NewWindow_3(); 
			 
			 
			// newwindow.button.button.setEnabled(false);
		}
		
	}
}
