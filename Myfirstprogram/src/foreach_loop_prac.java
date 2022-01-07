import java.util.ArrayList;
public class foreach_loop_prac {
          public static void main(String[] args) {
        	  
        	  /* for-each = traversing technique to iterate through the elements in a array/collection
        	                less type , more readable
        	                less flexible
        	   */
        	  
        	 /* String[] animals = {"cat","bird","dog","snake"};
        	  
        	  for(String i : animals) {
        		  System.out.println(i);
        	  }*/
        	  
        	  ArrayList<String> cars = new ArrayList<String>();
        	  
        	  cars.add("Buggati");
        	  cars.add("Lambo");
        	  cars.add("Tesla");
        	  cars.add("camero");
        	  
        	  for(String j: cars) {
        		  System.out.println(j);
        		  
        	  }
             
             
        	  
          }
          
}
