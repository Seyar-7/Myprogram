//befor we use GUI we need to import the file
import javax.swing.JOptionPane;

public class GUI_input_prac {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("what is your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
		//if we want change string to int we need to use "Integer.Parseint()' method
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you "));
		JOptionPane.showMessageDialog(null," You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"You are "+height+" cm");
		 
		String none = JOptionPane.showInputDialog(null,"can you tell me your eldest brother name\n if you dont have you can type NONE\n"
				+ "and if you have click ok or cencel or Type anythings");
		
		if(none.equalsIgnoreCase("none")) { 
			JOptionPane.showMessageDialog(null,"Sorry you dont have brother");
		}
		else { 
		String brother = JOptionPane.showInputDialog("what is your brother's name");
		int age1 = Integer.parseInt(JOptionPane.showInputDialog("how old is he"));
		double height1= Double.parseDouble(JOptionPane.showInputDialog("enter his height"));
		
		JOptionPane.showMessageDialog(null, ("your brother name is "+brother
				+" and he is "+age1+" years old and he is "+height1+" cm"));
		}
  
	}
}