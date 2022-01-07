import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jtextfield_2 extends JFrame implements ActionListener{

	JButton button;
	JTextField textfield;
	Jtextfield_2(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(200,50));
		textfield.setFont(new Font("consolas",Font.ITALIC,35));
		textfield.setForeground(Color.green);
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.white);
		textfield.setText("UserName");
		
		
		this.add(button);
		this.add(textfield);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("HELLO!!"+textfield.getText());
		    button.setEnabled(false);
			textfield.setEditable(false);
		}
		
	}

}
