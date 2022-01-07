
public class Generics_2 <Things,Things_2>{

	Things x;
	Things_2 y;
	
	Generics_2(Things x , Things_2 y ){
		this.x = x;
		this.y = y;
	}
	public Things getvalue(){
		return x;
	}
	
	public Things_2 getvalues() {
		return y;
	}
}
