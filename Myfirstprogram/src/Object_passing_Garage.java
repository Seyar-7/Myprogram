
public class Object_passing_Garage {
             
	   void Garage(Object_passing_Cars car) {
		   if(car.name.isBlank()) {
			   System.out.println("you didnt garage any of cars");
		   }
		   else{System.out.println("i parked the "+car.name+" car at the garage");}
	   }
}
