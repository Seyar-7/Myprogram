
public class overloaded_construction_2_prac {

	String breed;
	String cheese;
	String topping;
	String sauce;
	
overloaded_construction_2_prac(String breed ){
		
		this.breed = breed;

	}
	
overloaded_construction_2_prac(String breed,String sauce ){
		
		this.breed = breed;
		this.sauce = sauce;

		
	}
overloaded_construction_2_prac(String breed,String sauce,String cheese){
		
		this.breed = breed;
		this.sauce = sauce;
		this.cheese = cheese;

		
		
	}
	overloaded_construction_2_prac(String breed,String sauce,String cheese,String topping ){
		
		this.breed = breed;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
		
	}
	
}
