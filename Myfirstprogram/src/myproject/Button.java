package myproject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame implements ActionListener{
	JButton button2;
    JButton button1;
	JButton button;
	JButton button3;
	JButton button4;
	Button(){
		
		button4 = new JButton("KeyListener");
		//button.setBounds(150,150,100,50);
		button4.setSize(200,50);
		button4.setFocusable(false);
		button4.addActionListener(this);
		
		button3 = new JButton("JColoChooser");
		//button.setBounds(150,150,100,50);
		button3.setSize(200,50);
		button3.setFocusable(false);
		button3.addActionListener(this);
		
		button2 = new JButton("filechooser");
		//button.setBounds(150,150,100,50);
		button2.setSize(200,50);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		button = new JButton("Slider");
		//button.setBounds(150,150,100,50);
		button.setSize(200,50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		button1 = new JButton("jradio");
		//button1.setBounds(300,150,100,50);
		button1.setSize(200,50);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		this.setLayout(new GridLayout(1,1,10,10));
		this.add(button4);
		this.add(button3);
		this.add(button2);
		this.add(button1);
		this.add(button);
		//this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(720,720);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			this.dispose();
			new slider();
		}
		if(e.getSource()==button1) {
			this.dispose();
			new jradio();
		}
		if(e.getSource()==button2) {
			this.dispose();
			new Jfilechooser();
		}
		if(e.getSource()==button3) {
			this.dispose();
			new Jcolorchooser();
		}
		if(e.getSource()==button4) {
		    this.dispose();
		    new Keylistener();
		}
	}
}
