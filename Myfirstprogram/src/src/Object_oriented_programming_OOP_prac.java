package src;
public class Object_oriented_programming_OOP_prac {
    public static void main(String[] args) {
   	 
       /*
           object = an instance of a class that may contain attributes and methods
           example = (phone , desk , computer , coffee cup)
          
        */
    	OOP_cars_prac cars = new OOP_cars_prac();
    	OOP_cars_prac cars2 = new OOP_cars_prac();
    	 
    	System.out.println(cars.make);
    	System.out.println(cars.color);
    	System.out.println();
        System.out.println(cars.make);
        System.out.println(cars.model);
    	
    	
    	cars.drive();
    	cars.brakes();
    	
    	
    }
	
}
