import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Jtextfield_3 extends JFrame implements ActionListener{
	JTextField textfield;
	JButton button;
	Jtextfield_3(){
		
		button  = new JButton("submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		
		
		textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(200,50));
		
		textfield.setText("UserName");
		textfield.setFont(new Font("consolas",Font.PLAIN,35));
		textfield.setForeground(Color.green);
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.white);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);  
		this.add(textfield);
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JOptionPane.showMessageDialog(null,"HELLO!!"+textfield.getText());
			button.setEnabled(false);
			textfield.setEditable(false);
		}
		
	}
}
