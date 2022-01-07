import java.util.Scanner;
public class while_loop_prac {
	public static void main(String[]  args) {
		
		//  while loop = executes a block of code as long as a it's condition remains true
		
		
		Scanner scan = new Scanner(System.in);
	
		String name = "" ; 
		while(name.isBlank()){
			
			  System.out.print("what is your name: ");
			  name = scan.nextLine();
	    
		}
		System.out.println("your name is "+name);
	}

}
