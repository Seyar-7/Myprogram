
public class overloaded_construction_prac {
     public static void main(String[] args) {
    	 /*
    	     overloaded constructor = multiple constructors within a class with the same name,
    	                              by have different parameters 
    	                              name + parameters = signature
    	  */
    	 
    	 overloaded_construction_2_prac pizza;
    	 pizza = new overloaded_construction_2_prac("thicc crust","tomato","mazzerella");
    	 
    	 System.out.println("here are the ingredients of your pizza");
    	 System.out.println(pizza.breed);
    	 System.out.println(pizza.cheese);
    	 System.out.println(pizza.sauce);
    	 System.out.println(pizza.topping);
    	 
     }
}
