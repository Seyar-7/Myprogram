package myproject;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;



public class KeyBindings {

	JFrame frame;
	JLabel label;
	Action UpAction;
	Action DownAction;
	Action LeftAction;
	Action RightAction;
	
	KeyBindings(){
		
		
		frame = new JFrame("my game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		
		label = new JLabel();
		label.setBounds(100,100,100,100);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		
		UpAction = new UpAction();
		DownAction = new DownAction();
		
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "UpAction");
	    label.getActionMap().put("UpAction", UpAction);
	    
	    label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "DownAction");
	    label.getActionMap().put("DownAction", DownAction);
	    
	    label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "LeftAction");
	    label.getActionMap().put("LeftAction", LeftAction);
		
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX(), label.getY()-10);
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX(), label.getY()+10);
			
		}
		
		
		public class LeftAction extends AbstractAction{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setLocation(label.getX()-10, label.getY());
				
			}
			
		}
		
		
		public class RightAction extends AbstractAction{

			@Override
			public void actionPerformed(ActionEvent e) {
			
				label.setLocation(label.getX()+10, label.getY());
				
			}
			
		}
		
	}
	
	
	
}
