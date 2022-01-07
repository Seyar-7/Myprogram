import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButton_2 extends JFrame implements ActionListener{
          JFrame frame;
          JButton button;
          ImageIcon icon;
          JLabel label;
	JButton_2(){
		label = new JLabel();
		icon = new ImageIcon("the last of us.png");
		label.setIcon(icon);
		label.setBounds(180,350,200,200);
		label.setVisible(false);
		
		
		
		frame = new JFrame();
		   button = new JButton();
		   
		  button.setText("This is button");
		  button.setBounds( 200,200 ,200, 100);
		  button.addActionListener(this);
		 // button.setLayout(null);
		 // button.setIconTextGap(-25);
		//  button.setEnabled(false);
		  button.setVerticalTextPosition(JButton.BOTTOM);
		  button.setHorizontalTextPosition(JButton.CENTER);
		  button.setFont(new Font("Comic Sans",Font.BOLD,20));
		  button.setForeground(Color.CYAN);
		  button.setBackground(Color.GRAY);
		  button.setFocusable(false);
		  button.setBorder(BorderFactory.createEtchedBorder());
		  
		  
		  
		this.setSize(600,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(button);
	   this.add(label);
	}

     @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("pooo!");
		  // button.setEnabled(false);
			label.setVisible(true);
			
		}
		
	}
	
}
