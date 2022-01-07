import java.util.Random;

public class local_scope {

	
	local_scope(){
		Random random = new Random();
		int number;
		number = 0;
        roller(random,number);
		
	}
	void roller(Random random,int number) {
		number = random.nextInt(6)+1;
		System.out.println("local--"+number);
	}
	
}
