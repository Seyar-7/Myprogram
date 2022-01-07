
public class Array_of_objects {
          public static void main(String[] args) {
        	  
        	  //Array_of_objects_2[] Refrigerator = new Array_of_objects_2[3];
        	  Array_of_objects_2 food1 = new Array_of_objects_2("pizza"); 
        	  Array_of_objects_2 food2 = new Array_of_objects_2("Hamburger"); 
        	  Array_of_objects_2 food3 = new Array_of_objects_2("Rice"); 
        	  
        	  Array_of_objects_2[] Refrigerator = {food1,food2,food3};
        	  //or
      /*
        	  Refrigerator[0] = food1;
        	  Refrigerator[1] = food2;
        	  Refrigerator[2] = food3;
        	  */
        	/*  
        	  System.out.println(Refrigerator1[0].name);
        	  System.out.println(Refrigerator1[1].name);
        	  System.out.println(Refrigerator1[2].name);
        	 */
        	  for(int i=0; i<Refrigerator.length;i++) {
        		 System.out.println(Refrigerator[i].name);
        	  }
        	  
          }
}
