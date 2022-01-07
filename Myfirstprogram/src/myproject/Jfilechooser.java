package myproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Jfilechooser extends JFrame implements ActionListener{

	
	JButton button;
	JButton button1;
	
	Jfilechooser(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		button1 = new JButton("Back to Main");
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		this.add(button1);
		this.add(button);
		this.setSize(200,150);
		this.setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser filechooser = new JFileChooser();
			
			filechooser.setCurrentDirectory(new File("C:\\Users\\Seyar\\Desktop"));
			int response = filechooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(filechooser.getCurrentDirectory().getAbsolutePath());
				System.out.println(file);
			}
			
		}
		if(e.getSource()==button1) {
			this.dispose();
			new Button();
		}
		
	}

}
