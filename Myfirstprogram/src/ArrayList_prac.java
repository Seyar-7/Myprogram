import java.util.ArrayList;
public class ArrayList_prac {

	public static void main(String[] args) {
	
		// ArrayList = a resizable array.
		// 			   Elements can be added and removed after compilation phase
		// 			   store reference data type
		
		
		
		ArrayList<String> food = new ArrayList<String>();  // we can only write reference data type in ArrayList;
		
		food.add("pizza");
		food.add("Burger");
		food.add("Hotdogs");
		
		food.set(2,"sushi");
		//food.remove(1);
		//food.clear();  //it will delete all elements
        System.out.println(food.get(1));
		
		for(int i = 0; i<food.size();i++) {
			
			System.out.println(food.get(i));
		}
		
		 System.out.println("\n");
		
	    ArrayList<Character> symbols = new ArrayList<Character>();
	    
	    symbols.add('@');
	    symbols.add('!');
	    symbols.add('*');
	    
	    symbols.set(1,'&');
	    symbols.remove(2);
	    symbols.clear();
	    System.out.print("these are the useful symbols in java ");
	    for(int j = 0; j<symbols.size(); j++) {
	    	System.out.print("  "+symbols.get(j));
	    }
	    
	    
	}

}
