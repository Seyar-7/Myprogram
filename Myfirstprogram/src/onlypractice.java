import java.util.ArrayList;
import java.util.Scanner;

public class onlypractice {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=5;i++) {
			//System.out.print(i+"\t");
			for(int j = 1; j<=i; j++) {
			   System.out.print(j+"\t");
			  
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------------------------------------");
		
		int k = 1;
		int f;
		
		while(k <= 5) {
			//System.out.print(k);
			f = 1;
			
			while(f <= k ) {
				System.out.print(f+"\t");
			    f++;
			}
			System.out.println();
			k++;
		}
		System.out.println("----------------------------------------------------------------");

		 String[] hello = {"1","2","3","4"};
		 double change = 0;
		
		 for(int g = 0; g<hello.length; g++) {
			 change = Double.parseDouble(hello[g]);
			 System.out.println(change);
		 }
		
		 System.out.println("----------------------------------------------------------------");
		  ArrayList<String> arr = new ArrayList<String>();
		  arr.add("1");
		  arr.add("2");
		  arr.add("3");
		  arr.add("4");
		  arr.add(1,"7");
		  arr.remove(0);
		 double chan = 0;
		//System.out.println(arr.get(2));
		 
		 for(int g = 0; g<arr.size(); g++) {
			 chan = Double.parseDouble(arr.get(g));
			 System.out.println(chan);
		 }
		 */
		 System.out.println("----------------------------------------------------------------");
		/* int sum = 0;
		 
		 int[][] twoD = {{1,2,3},{4,5,6},{7,8,9},{10,11}}; 
		 
		  for(int i=0; i<twoD.length;i++) {
			  System.out.println();
			  for(int j = 0; j<twoD[i].length;j++) {
				  System.out.print(twoD[i][j]+"\t");
				  
				  sum += twoD[i][j];
			  }
		  }
		 // System.out.println(sum);*/
		 
		 int rows;
		 int colums;
		 String symbols;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter # of rows");
		 rows = scan.nextInt();
		 
		 System.out.println("Enter # of colums");
		 colums = scan.nextInt();
		 
		 System.out.println("Enter the symbols");
		 symbols = scan.next();

		 for(int i = 0; i<rows; i++) {
			 System.out.println();
			 for(int j = 0; j<colums; j++) {
				 System.out.print(symbols);
			 }
		 }
		 
	}

}
