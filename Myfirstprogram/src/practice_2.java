
public class practice_2 {
/*
       String name = "seyar";
       String last = "joyandah";
       int age = 22;
       double height = 1.77;
       double weight = 67.5;
       String ability = "software enginner";
       void male() {
    	    	 	
    	   System.out.println("he is male dude");
       }
       void female() {
    	   
    	   System.out.println("nope dude he is not female ");
       }
*/
	/*
	int age;
	String name;
	String last;
	*/
/*	
	practice_2(String name,String last,int age){
		this.age = age;
		this.name = name;
		this.last = last;
	
	}
	*/
	/*
	void drink() {
		System.out.println("i really like to drik cola");
	}*/
	
	/*
	String name;
    int age;
    
    practice_2(String name, int age){
    	this.name = name;
    	this.age = age;
    }
	
	public String toString() {
		return "my name is "+this.name+" and i am "+this.age+" years old ";
	}
	*/
	private String make;
	private String model;
	private int year;
	practice_2(String make,String model,int year){
		this.setmake(make);
		this.model = model;
		this.setyear(year);
	}
	public practice_2(practice_2 car) {
	       copy(car);
	
	}
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public void setmake(String make) {
		this.make = make;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	public void copy(practice_2 x) {
		this.setmake(x.getmake());
		this.setmodel(x.getmodel());
		this.setyear(x.getyear());
	}
	
}


