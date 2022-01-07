import java.util.Scanner;

public class nested_loop_prac {

	public static void main(String[] args) {
		
		//nested loop = a loop inside of loop;
		
		int rows;
		int colums;
		String symbols = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.print("Enter # of colums: ");
		colums = scanner.nextInt();
		
		System.out.print("Enter symbols to use: ");
		symbols = scanner.next();
		
		for(int i = 1; i <= rows; i++) {
			
			System.out.println();
			
			for(int j = 1; j <=colums; j++) {
			System.out.print(symbols);}
			
		}

	}

}
