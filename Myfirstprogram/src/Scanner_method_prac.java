import java.util.Scanner;
public class Scanner_method_prac {

	public static void main(String[] args) {
	  
		
		
		Scanner scanner= new Scanner(System.in);
          System.out.println("what is your name?");
          String name=scanner.nextLine();
          System.out.println("what is your last name?");
          String last = scanner.nextLine();     
          System.out.println("how old are you?");
          int age = scanner.nextInt();
          scanner.nextLine();
          System.out.println("where are you from?");
          String from = scanner.nextLine();
          System.out.println("what is your favorite food?"); 
          String food=scanner.nextLine();
          System.out.println("which school have you graduated");
          String school=scanner.nextLine();
          
           
          
          System.out.println("Hello " +name+" "+last);
          System.out.println("you are "+age+" years old ");
          System.out.println("you are from "+from);
          System.out.println("your favorite food is "+food);
          System.out.println("you graduated from "+school);
	}

}
