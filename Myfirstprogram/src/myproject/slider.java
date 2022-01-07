package myproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class slider extends JFrame implements ChangeListener,ActionListener{

	JPanel panel;
	JLabel label;
	JLabel label1;
	JSlider slider;
	JButton button;
	JButton button1;
	
	slider(){
		
		
		button = new JButton("Back to main");
		button.setSize(200,50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		button1 = new JButton("To F");
		button1.setSize(200,50);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		panel = new JPanel();
		label = new JLabel();
		label1 = new JLabel();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("mv boli",Font.PLAIN,25));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setText("°C ="+slider.getValue());
		label.setFont(new Font("mv boli",Font.PLAIN,35));
		label1.setText("°F ="+((slider.getValue() * 9/5) + 32 ));
		label1.setFont(new Font("mv boli",Font.PLAIN,30));
		label1.setVisible(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		
		
		panel.add(slider);
		panel.add(label1);
		panel.add(label);
		panel.add(button);
		panel.add(button1);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C ="+slider.getValue());
		label1.setText("°F ="+((slider.getValue() * 9/5) + 32 ));
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			this.dispose();
			new Button();
		}
		if(e.getSource()==button1) {
			label1.setVisible(true);
			button1.setVisible(false);
		}
		
	}

}
