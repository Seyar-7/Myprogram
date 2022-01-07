
public class Polymorphism {

	public static void main(String[] args) {
	
		/*
		  polymorphism = greek word for poly -"many" , morph-"form
		                 the ability of an object to identify as more than one type
		 */
		
		Polymorphism_car car = new Polymorphism_car();
		Polymorphism_bicycle bicycle = new Polymorphism_bicycle();
		Polymorphism_boat boat = new Polymorphism_boat();
		
		Polymorphism_vehicle[] racer = {car,bicycle,boat};
		
		//foreach
		for(Polymorphism_vehicle j:racer) {
			j.go();
		}
		System.out.println();
		
		//for-loop
        for(int i = 0;i<racer.length;i++) {
           racer[i].go();
        }
	}

}
