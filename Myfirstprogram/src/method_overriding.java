
public class method_overriding {
        public static void main(String[] args) {
        	
       /*
         method overriding = Declaring a method in sub class 
                             which is already present in parent class
                             done so that a child class can give its own implementation.
        */
        	method_overriding_animal animal = new method_overriding_animal();
        	method_overriding_dog dog = new method_overriding_dog();
        	
        	animal.speak();
        	dog.speak();
        	
        	
        }
        
}
