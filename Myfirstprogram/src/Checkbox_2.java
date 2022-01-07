import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkbox_2 extends JFrame implements ActionListener{

	JCheckBox checkbox;
	JButton button;
	
	Checkbox_2(){
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		checkbox = new JCheckBox();
		checkbox.setText("I'm not a robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font(null,Font.PLAIN,25));
		//checkbox.setIcon(null);//it will set first icon.
		//checkbox.setSelectedIcon(null);//it will set second icon.
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());
		}
		
	}

}
