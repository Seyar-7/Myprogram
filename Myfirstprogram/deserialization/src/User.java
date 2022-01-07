
import java.io.Serializable;

public class User implements Serializable{ 
	
	String name;
	String password;
 
	public void Getvalue() {
		System.out.println("Hello "+name);
	}

}
