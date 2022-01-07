
public class TwoD_arrays_prac {

	public static void main(String[] args) {
	
		//2D arrays= an array of arrays
		
		//first way
		
		String[][] cars = {
				           {"mustang","lambo","bugga"},
				           {"Tesla","Ranger","Ferrari"},
				           {"F-150","Camero","Land-crusier"},
				           {"seyar","morid"}
				           };
				             
		
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+"  ");
			}
		}
	/*
		//second way
		String[][] cars = new String[3][3];
		
		cars[0][0] = "mustang";
		cars[0][1] = "lambo";
		cars[0][2] = "bugga";
		cars[1][0] = "Tesla";
		cars[1][1] = "Ranger";
		cars[1][2] = "Ferrari";
		cars[2][0] = "F-150";
		cars[2][1] = "camero";
		cars[2][2] = "Land-crusier;";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			
			for(int j=0;j<cars.length;j++) {
				System.out.print(cars[i][j]+"  ");
			}
					
		}
		*/
		
		
	}

}
