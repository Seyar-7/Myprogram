import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jslider_2 extends JFrame implements ChangeListener{

	JPanel panel;
	JLabel label;
	JSlider slider;
	Jslider_2(){
		
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);//MIN,MAX,STARTER
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("mv boli",Font.PLAIN,15));
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setText("°C = "+slider.getValue());
		label.setFont(new Font("mv boli",Font.PLAIN,35));
		
		panel.add(slider);
		panel.add(label);
		
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C = "+slider.getValue());
		
	}

}
