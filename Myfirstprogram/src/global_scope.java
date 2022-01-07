import java.util.Random;

public class global_scope {
            
	Random random;
	int number;
	
	
	global_scope(){
		random = new Random();
		
		roller();
	}
	void roller() {
		number = random.nextInt(6)+1;
		System.out.println("global--"+number);
	}
}
