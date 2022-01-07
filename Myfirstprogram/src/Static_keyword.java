
public class Static_keyword {

	public static void main(String[] args) {
	    
		/*
		  static = modifier. A single copy of a variable/method is created and shared
		           the class "owns" the static member
		 */
		
		
		static_keyword_2 friend1 = new static_keyword_2("Arshad");
		static_keyword_2 friend2 = new static_keyword_2("tamim");
		static_keyword_2 friend3 = new static_keyword_2("Ehsan");
		static_keyword_2 friend4 = new static_keyword_2("Eman");
		
		System.out.println(static_keyword_2.Numberoffriends);

		static_keyword_2.display();
		
		
	}

}
