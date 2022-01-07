import java.util.*;

public class TwoD_ArrayList_prac {

	public static void main(String[] args) {
	
		// 2D ArrayList = a dynamic list of lists
		// you can change the size of these lists during runtime
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		 
		ArrayList<String> pruduceList = new ArrayList();
		
		pruduceList.add("tomatoes");
		pruduceList.add("zuchini");
		pruduceList.add("peppers");
		
	    ArrayList<String> drinkList = new ArrayList();
	    
	    drinkList.add("soda");
	    drinkList.add("coffee");

        ArrayList<Integer> List = new ArrayList();
	    
	    List.add(1);
	    List.add(12);
	    
	    
	    groceryList.add(bakeryList);
	    groceryList.add(pruduceList); 
	    groceryList.add(drinkList); 
	    for(int i=0;i<groceryList.size();i++) {
	    System.out.println(groceryList.get(0).get(i));
	    System.out.println(groceryList.get(1).get(i));
	    }
	    
	    
	    
	    
	}

}
