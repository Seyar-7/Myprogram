import javax.swing.JOptionPane;

public class Joptionpane {

	public static void main(String[] args) {
	
		/*
		  JOptionPane = Pop up a standard dialog box that prompts users for a value
		                or informs them of something.
		 */
		//JOptionPane joption = new JOptionPane();
		
		// JOptionPane.showMessageDialog(null, "This is some useless info!","title",JOptionPane.PLAIN_MESSAGE);  //ParentComponent,message,title,optionType.
		// JOptionPane.showMessageDialog(null,"This is more usless info!!","Information",JOptionPane.INFORMATION_MESSAGE);  //ParentComponent,message,title,optionType.
		// JOptionPane.showMessageDialog(null,"Really Seyar??", null, JOptionPane.QUESTION_MESSAGE);  //ParentComponent,message,title,optionType.
		// JOptionPane.showMessageDialog(null,"WARNING! , Your computer has a VIRUS!!!", null, JOptionPane.WARNING_MESSAGE);  //ParentComponent,message,title,optionType.
		// JOptionPane.showMessageDialog(null,"Call teach support NOW or ELSE!!!",null,JOptionPane.ERROR_MESSAGE);  //ParentComponent,message,title,optionType.
		
		   int answer = JOptionPane.showConfirmDialog(null,"Seyar, do you ever code","this is my title",JOptionPane.YES_NO_CANCEL_OPTION);//ParentComponent,message,title,optionType.
		   //System.out.println(answer);
		  
		     String name = JOptionPane.showInputDialog("HELLO!! can you tell me your name");
		      JOptionPane.showMessageDialog(null,"hello !!"+name);
		        System.out.println("HELLO!!"+name);
		        
		        JOptionPane.showOptionDialog(null,
		        		"you are awesome","secretMessage", 
		        		JOptionPane.YES_NO_CANCEL_OPTION,
		        		JOptionPane.INFORMATION_MESSAGE,null, null,0);  ///ParentComponent,message,title,optionType,MessageType,icon,Option,InitialValue.
		
	} 
}
