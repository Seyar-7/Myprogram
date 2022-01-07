
public class constructor_prac {

	public static void main(String[] args) {
		
//   constructor = special method that is called when an object is instantiated (created)
		
		constructor2_prac human = new constructor2_prac("Seyar",22,67);
		constructor2_prac human2 = new constructor2_prac("morid",20,75);
		System.out.println("my name is "+human.name);
		System.out.println("my brother name is "+human2.name);
		human.eat();
		human2.drink();
	
	}

}
