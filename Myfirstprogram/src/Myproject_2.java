import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Myproject_2 extends JFrame implements ActionListener{

	
	//BUTTONS
	JButton button1;
	JButton button2;
	//PANELS
	JPanel panel;
	JPanel panel3;
	JPanel panel2;
	//LABELS
	JLabel label;
	JLabel label2;

	
	
	Myproject_2(){
		
		
		this.setSize(720,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.cyan);
		panel2.setBounds(450,0,720,720);
		panel2.setLayout(null);
		
//--------------------------------button1
		button1 = new JButton("1");
		button1.setBounds(10,50,50,50);
		button1.setFocusable(false);
		button1.addActionListener(this);
//-------------------------------button2
		button2 = new JButton("2");
		button2.setBounds(100,50,50,50);
		button2.setFocusable(false);
		button2.addActionListener(this);
//-------------------------------button2
		button2 = new JButton("2");
		button2.setBounds(100,50,50,50);
		button2.setFocusable(false);
		button2.addActionListener(this);
//-------------------------------button2
//-------------------------------button2
//-------------------------------button2
//-------------------------------button2
//-------------------------------button2
//-------------------------------button2
//-------------------------------button2
//------------------------------------label
		
		label = new JLabel();
		label.setBounds(30,30,50,50);
		label.setText("x");
	    label.setFont(new Font("mv boli",Font.PLAIN,50));//set font of text
//-----------------------------------label2
	    label2 = new JLabel();
		label2.setBounds(30,30,50,50);
		label2.setText("o");
	    label2.setFont(new Font("mv boli",Font.PLAIN,50));//set font of text
//-----------------------------panel
		panel = new JPanel();
		panel.setBounds(10,50,100,100);
		//panel.setPreferredSize(new Dimension(50,50));
		panel.setBackground(Color.blue);
		panel.setLayout(null);
//----------------------------panel3		
		panel3 = new JPanel();
		panel3.setBounds(150,50,100,100);
		//panel.setPreferredSize(new Dimension(50,50));
		panel3.setBackground(Color.blue);
		panel3.setLayout(null);
		
		
		
		this.setLayout(null);
		this.setVisible(true);
//-------------------adds
		this.add(button1);
		this.add(panel);
		this.add(panel2);
		this.add(panel3);
	    panel.add(label);
	    panel3.add(label2);
//------------------------	    
	    panel2.add(button1);
	    panel2.add(button2);
//-------------------------	 
	    label.setVisible(false);
	    label2.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			System.out.println("poo1");
			label.setVisible(true);
			
		}
		if(e.getSource() == button2) {
			System.out.println("poo2!");
			label2.setVisible(true);
			
		}
		
	}
}










/*JButton button2 = new JButton("2");
JButton button3 = new JButton("3");
JButton button4 = new JButton("4");
JButton button5 = new JButton("5");
JButton button6 = new JButton("6");
JButton button7 = new JButton("7");
JButton button8 = new JButton("8");
JButton button9 = new JButton("9");*/