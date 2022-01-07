import javax.swing.JFrame;

public class TWO_D_Animation_1 extends JFrame{

	TWO_D_Animation_2 panel = new TWO_D_Animation_2();
	
	TWO_D_Animation_1(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
