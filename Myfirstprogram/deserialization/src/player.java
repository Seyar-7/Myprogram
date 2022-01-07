import java.io.Serializable;

public class player implements Serializable{
	
	String name;
	int year;
	
	public void getvalue(){
		
		System.out.println("Hello my name is "+name+" and i am "+year+" years old");
	}

}
