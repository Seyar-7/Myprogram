
public class Copy_objects {

	public static void main(String[] args) {
		
		Copy_objects_car car1 = new Copy_objects_car("Cheverolet","Camaro",2021);
		//Copy_objects_car car2 = new Copy_objects_car("Land cruiser","Toyota",2020);
		
		System.out.println(car1);
	//	System.out.println(car2);
		
		// car2.copy(car1);
		Copy_objects_car car2 = new Copy_objects_car(car1);
		
		System.out.println();
        System.out.println(car1.getmake());
        System.out.println(car1.getmodel());
        System.out.println(car1.getyear());
        System.out.println();
        System.out.println();
        System.out.println(car2.getmake());
        System.out.println(car2.getmodel());
        System.out.println(car2.getyear());
        
	}

}
