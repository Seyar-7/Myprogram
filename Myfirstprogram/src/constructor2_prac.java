
public class constructor2_prac {
	
	
	String name;
	int age;
	double weight;
	

	constructor2_prac(String name,int age,double weight){
		 
	this.name = name;
	this.age = age;
	this.weight = weight;
	
	}
	void eat() {
		System.out.println(name+" like to eat burger");
	}
	void drink() {
		System.out.println(name+" Like to drink cola");
	}
	
}
