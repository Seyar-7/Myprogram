package myproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Jcolorchooser extends JFrame implements ActionListener{

	JButton button1;
	JButton button2;
	JButton button3;
	JLabel label;
	JPanel label2;
	Jcolorchooser(){
		
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.setText("Hello world!!");
		label.setFont(new Font("mv boli",Font.PLAIN,100));
		//label.setPreferredSize(new Dimension(400,100));
		label.setBorder(border);
		
		
		button3 = new JButton("Back to main");
		button3.setFocusable(false);
		button3.addActionListener(this);
		
		button2 = new JButton("Choose color for text");
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		
		button1 = new JButton("Choose color for background");
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		label2 = new JPanel();
		label2.add(button1);
		label2.add(button2);
		label2.add(button3);
		label2.setLayout(new GridLayout(3,1));
		
		
	    this.add(label2);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==button1) {
			 
			 JColorChooser colorchooser = new JColorChooser();
			 Color color = JColorChooser.showDialog(null, "choose color", Color.BLACK);
			 label.setBackground(color);
			 label.setOpaque(true);
			 
		 }
		 if(e.getSource()== button2) {
			 JColorChooser colorchooser = new JColorChooser();
			 Color color = JColorChooser.showDialog(null,"choose color", Color.black);
			 label.setForeground(color);
		 }
		 if(e.getSource()==button3) {
			 this.dispose();
			 new Button();
		 }
		
	}

}
