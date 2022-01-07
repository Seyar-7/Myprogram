
public class Array_prac {

	public static void main(String[] args) {
		
		//arrays = used to store multiple values in a single variable
		
		
		/*
		String[] cars = {"camero","corvette","tesla"};
		
		System.out.println(cars[1]);
		*/
		
		String[] cars = new String[4];
		
		cars[0] = "camero";
		cars[1] = "corvette";
		cars[2] = "Tesla";
		cars[3] = "Lomborghini";
		
		for(int i = 0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}

	}

}
