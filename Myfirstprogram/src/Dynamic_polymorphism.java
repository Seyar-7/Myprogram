import java.util.Scanner;

public class Dynamic_polymorphism {

	public static void main(String[] args) {
		
		/*
		 Polymorphism = many shapes/forms
		 dynamic  =  after compilation (during runtime)
		 
		 ex. A corvette is a: corvette, and a car, and a vehicle, and and object
		 
		 */

		Scanner scanner = new Scanner(System.in);
		Dynamic_polymorphism_Animals animals;
		
		System.out.println("what animals do you want");
		System.out.print("(dog=1) and (cat=2) :");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animals = new Dynamic_polymorphism_Dog();
			animals.speak();
		}
		else if(choice==2) {
			animals = new Dynamic_polymorphism_Cat();
			animals.speak();
			
		}
		else {
			System.out.println("the choice goes to invalids");
			animals = new Dynamic_polymorphism_Animals();
			animals.speak();
		}
		
		
	}

}
