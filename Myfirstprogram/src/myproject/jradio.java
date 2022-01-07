package myproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class jradio extends JFrame implements ActionListener{

	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton sausuge;
	JButton button;
	jradio(){
		
		button = new JButton("Back to main");
		button.setSize(200,50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		pizza = new JRadioButton("pizza");
		burger = new JRadioButton("burger");
		sausuge = new JRadioButton("sausuge");
		
		
		pizza.setFocusable(false);
		pizza.addActionListener(this);
		
		burger.setFocusable(false);
		burger.addActionListener(this);
		
		sausuge.setFocusable(false);
		sausuge.addActionListener(this);
		
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(burger);
		group.add(pizza);
		group.add(sausuge);
		
        this.add(button);
		this.setLayout(new FlowLayout());
		this.add(burger);
		this.add(sausuge);
		this.add(pizza);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza) {
			System.out.println("you ordered a pizza!!");
		}
		else if(e.getSource()==burger) {
			System.out.println("you ordered a burger!!");
		}
		else if(e.getSource()==sausuge) {
			System.out.println("you ordered a sausuge!!");
		}
		if(e.getSource()==button) {
			this.dispose();
			new Button();
		}
		
	}

	
}
