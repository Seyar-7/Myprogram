import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Jfilechooser_1 extends JFrame implements ActionListener{

	JButton button;
	Jfilechooser_1(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,100);
		
		button = new JButton("Select");
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.add(button);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==button) {
			this.dispose();
			
			JFileChooser filechooser = new JFileChooser();
			
			filechooser.setCurrentDirectory(new File("C:\\Users\\Seyar\\Desktop"));
			
			//int response = filechooser.showOpenDialog(null);
			int response = filechooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
		}
			
		}
		
	}

}
