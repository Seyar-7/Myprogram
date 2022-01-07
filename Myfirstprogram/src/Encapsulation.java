
public class Encapsulation {

	public static void main(String[] args) {
	     
		
		/*
		  Encapsulation = attributes of a class will be hidden or private
		                  can be accessed only through methods (getters & setters)
		                  you should make attributes private if you don't have a reason to make then public / protected 
		 */
           
		  
		Encapsulation_car car = new Encapsulation_car("Cheverolet","Camaro",2021);
		car.setyear(2022);
		System.out.println(car.getmake());
		System.out.println(car.getmodel());
		System.out.println(car.getyear());
	}

}
