import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class KeyBindings_2 {

	JFrame frame;
	JLabel label;
	Action UpAction;
	Action DownAction;
	Action LeftAction;
	Action RightAction;
	
	
	
	KeyBindings_2(){
		
	
		
		frame = new JFrame("My Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBounds(100,100,100,100);
	    
		UpAction = new UpAction();
		DownAction = new DownAction();
		LeftAction = new LeftAction();
		RightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "UpAction");
		label.getActionMap().put("UpAction",UpAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "DownAction");
		label.getActionMap().put("DownAction", DownAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "LeftAction");
		label.getActionMap().put("LeftAction",LeftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"RightAction");
		label.getActionMap().put("RightAction", RightAction);
		frame.add(label);
		frame.setVisible(true);
		
		
		
	}
	
	public class UpAction extends AbstractAction{
		
	@Override
	public void actionPerformed(ActionEvent e) {
	
		label.setLocation(label.getX(),label.getY()-10);
		
	     }
	}
	
	public class DownAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX(), label.getY()+10);
			
		     }
		}
	
	public class RightAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX()+10, label.getY());
			
		     }
		}
	
	public class LeftAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX()-10, label.getY());
			
		     }
		}
	
	
	
	
}
