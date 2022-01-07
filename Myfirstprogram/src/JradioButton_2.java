import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JradioButton_2 extends JFrame implements ActionListener{

	
	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton sausage;
	
	JradioButton_2(){
		
		pizza = new JRadioButton("Pizza");
		burger = new JRadioButton("Burger");
		sausage = new JRadioButton("Sausage");
		
		pizza.setFocusable(false);
		pizza.addActionListener(this);
		
		burger.setFocusable(false);
		burger.addActionListener(this);
		
		sausage.setFocusable(false);
		sausage.addActionListener(this);
		
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(pizza);
		group.add(burger);
		group.add(sausage);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		this.add(pizza);
		this.add(burger);
		this.add(sausage);
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
		else if(e.getSource()==sausage) {
			System.out.println("you ordered a sausage!!");
		}
	}
}
