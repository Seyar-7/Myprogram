import java.util.Random;

public class Random_numbers_prac {

	public static void main(String[] args) {
		
		Random random = new Random();
 
		int x = random.nextInt(10)+1;
		System.out.println(x);
		
		float y = random.nextFloat()+6;
		System.out.println(Math.floor(y));
		
		boolean z = random.nextBoolean();
		  System.out.println(z);
	}

}
