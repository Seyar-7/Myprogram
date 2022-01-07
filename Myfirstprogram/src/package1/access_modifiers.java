package package1;
import   package2.*;
public class access_modifiers extends C {

	public static void main(String[] args) {
	/*
	                            Access levels
	   
	   Modifier         class		package		 subclass		 world
	   
	   public			  Y			  Y				Y 			   Y
	   Protected		  Y			  Y				Y 			   N
	   no modifier	      Y			  Y				N 			   N
	   Private			  Y			  N				N 			   N  
	 */
		C c = new C();
		System.out.println(c.publicmessage);
		access_modifiers access = new access_modifiers();
		System.out.println(access.protectedmessage);

	}

}
