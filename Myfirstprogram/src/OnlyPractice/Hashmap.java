package OnlyPractice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<Object,Integer> hash = new HashMap<>();
		
		String information = "this is ahmad seyar i am from afghanistan";
		
		hash.put("1", 1);
		System.out.println(hash.get("1"));
		/*
		int count1 = 1;
		int count2 = 1;
		
		for(char i :information.toCharArray()) {
			if(i == 't') {
				hash.put(i, count1++);
			}
			if(i == 's') {
				hash.put(i, count2++);
			}
			
		}
		*/
		System.out.println(hash);
		/*
		hash.put(1 ,"one" );
		hash.put(2, "two");
		hash.put(3, "three");
		System.out.println(hash.get(1));
		System.out.println(hash.containsKey(1));
		System.out.println(hash.containsKey(3));
		System.out.println(hash.values());
		*/
	/*	
		for(char i:information.toCharArray()) {
			if(hash.containsKey(i)) {
				
				int count = hash.get(i)+1;
				hash.put(i, count);
				
			}else {
				hash.put(i, 1);
			}
		}
	System.out.println(hash);
	*/
		String name = "";
		for(int i = 0; i<information.length(); i++) {
	       if(hash.containsKey(information.charAt(i))) {
				
				int count = hash.get(information.charAt(i))+1;
				hash.put(information.charAt(i), count);
				
			}else {
				hash.put(information.charAt(i), 1);
			}
		}
		
		System.out.println(hash);
		}
		

}
