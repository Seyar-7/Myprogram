import java.util.Scanner;
public class logical_operators_Prac {

	public static void main(String[] args) {
		
		//And
//	     int temp = 20;
//		
//		if(temp>=30 && temp<=40) {
//			System.out.println("today is so hot");
//			
//		}
//		else if(temp<30 && temp >=20) {
//			System.out.println("today is warm");
//		}
		
		
		//Or
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("press q or Q to quit the game");
		String res = scanner.next();
		if(res.equals("q") || res.equals("Q")){
			System.out.println("you quit the game");
		}
		else {
			System.out.println("you are still playing this game");
		}
			*/
		
		//! --- not equal
		Scanner scanner = new Scanner(System.in);
		System.out.println("press q or Q to quit the game");
		String res = scanner.next();
		if(!res.equals("q") && !res.equals("Q")){
			System.out.println("you are still playing this game");
		}
		else {
			System.out.println("you quit the game");
		}
		

	}

}
