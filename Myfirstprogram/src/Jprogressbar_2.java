import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class Jprogressbar_2 {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500);//MIN,MAX.
	Random rand = new Random();
	Jprogressbar_2(){
	
		bar.setPreferredSize(new Dimension(400,50));
		bar.setStringPainted(true);
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	public void fill() {
		int counter = 0;
		
		
		while(counter<=500) {
			
			bar.setValue(counter);
			bar.setString(counter+"/500 HP");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=rand.nextInt(6)+1;
		}
		bar.setString("Done!! :)");
	}
	
	
}
