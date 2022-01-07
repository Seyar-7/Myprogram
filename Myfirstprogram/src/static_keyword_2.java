
public class static_keyword_2 {
        String name;
        
        static int Numberoffriends;
	static_keyword_2(String name){
		this.name = name;
		Numberoffriends++;
	}
	static void display() {
    
	System.out.println("i have "+Numberoffriends+" friends");
	}

}
