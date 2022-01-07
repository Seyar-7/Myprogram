import javax.swing.JFrame;

public class DragAndDrop_JFrame extends JFrame{

	DragAndDrop_JFrame(){
		
		DragAndDrop_JPanel panel = new DragAndDrop_JPanel();
		
		this.add(panel);
		this.setTitle("DragAndDrop");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
