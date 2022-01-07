
public class Object_passing {
        public static void main(String[] args) {

        	Object_passing_Cars car1 = new Object_passing_Cars("Buggati");
        	Object_passing_Cars car2 = new Object_passing_Cars("Tesla");
        	Object_passing_Cars car3 = new Object_passing_Cars("");
        	Object_passing_Garage garage = new Object_passing_Garage(); 
	        
        	garage.Garage(car1);
        	garage.Garage(car2);
        	garage.Garage(car3);
      }
}
