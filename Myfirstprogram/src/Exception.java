import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		
		/*
		  exception = an event that occurs during the execution of a program that,
		              disrupts the normal flow of instructions
		 */
		Scanner scanner = new Scanner(System.in);
		try {
		
		
		System.out.print("Enter the whole number to divide :");
		int x = scanner.nextInt();
		
		System.out.print("Enter the whole number to divide by Y :");
		int y = scanner.nextInt();
		
		int z = x/y;
				System.out.println("Result = "+z);
				}
		catch(ArithmeticException e) {
			System.out.println("Dont enter zero you IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("you enter the character dont use the character");
		}
//		catch(Exception e) {
//			System.out.println("you got something wrong");
//		}
		finally{
			scanner.close();
		}
	}

}
