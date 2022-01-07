import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel {
	public static void main(String[] args) {
		
		//JPanel = A GUI component that function as a container to hold other components.
		
		 ImageIcon image = new ImageIcon("well done.jpg");
		 JLabel label  = new JLabel();
		 label.setText("Hello world");
		 label.setForeground(new Color(123,50,250));
		 label.setOpaque(true);
		 
		label.setIcon(image);
		// label.setVerticalAlignment(JLabel.TOP);
		 //label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(265,125,200,200);
		 
		 
		 
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
		redpanel.setBounds(15, 0, 250, 250);
		redpanel.setLayout(null);
		
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(265,0,250,250);
		bluepanel.setLayout(null);
		
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(15,250,500,250);
		greenpanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		greenpanel.add(label);
		frame.setVisible(true);
		
		
	}

}