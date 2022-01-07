import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jcolorchooser_1 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	
	JLabel label;
	
	
	Jcolorchooser_1(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.setText("This is some text!!");
		label.setFont(new Font("mv boli",Font.PLAIN,100));
		label.setOpaque(true);
		
		
		button1 = new JButton("background color");
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		
		button2 = new JButton("text color");
		button2.addActionListener(this);
		button2.setFocusable(false);
		
		
		this.add(button2);
		this.add(button1);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			
			JColorChooser colorchooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null,"Pick any colos",Color.BLACK);
			
		    label.setBackground(color);
			
		}
		if(e.getSource()==button2) {
			
			JColorChooser colorchooser = new JColorChooser();
			
			Color color = colorchooser.showDialog(null,"pick any colos",Color.LIGHT_GRAY);
			
			label.setForeground(color);
		}
		
	}

}
