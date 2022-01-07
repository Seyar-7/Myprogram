
public class super_keyword_brother extends super_keyword_person{

	String brother;
	
	super_keyword_brother(String name, int age , String brother){
		
		super(name,age);
		this.brother = brother;
	}
	
	public String toString() {
	return super.toString()+ this.brother;	
	}
}