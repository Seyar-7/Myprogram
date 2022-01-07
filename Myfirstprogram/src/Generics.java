import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		
		/*
		  Generics = enable types (classes and interfaces) to be parameters when defining
		             classes, interfaces and methods
		             a benefits it to eliminate the need to create multiple versions 
		             of methods or classes for various data types.
		             Use 1 version for all references data types.
		 */
		
//		Generics_2<Integer,Double> integerarray = new Generics_2<>(100,18.99);
//		Generics_2<Double,Integer> doublearray = new Generics_2<>(14.33,244);
//		Generics_2<Character,String> characterarray = new Generics_2<>('@',"morid");
//		Generics_2<String,Character> stringarray = new Generics_2<>("seyar",'&');
		 
		
//		System.out.println(integerarray.getvalue()+"      "+integerarray.getvalues());
//		System.out.println(doublearray.getvalue()+"      "+doublearray.getvalues());
//		System.out.println(characterarray.getvalue()+"      "+characterarray.getvalues());
//		System.out.println(stringarray.getvalue()+"      "+stringarray.getvalues());
		
		/*
		Integer[] integer = {1,2,3,4};
		Double[] dou = {1.23,12.22,45.5};
		Character[] character = {'!','@'};
		String[] string = {"Hello world"};
		
		
		
		fill(integer);
		fill(dou);
		fill(character);
		fill(string);
		*/
		
	}
	/*
		public static void fill(Integer[] array) {
		  for(Integer x : array ) {
			  System.out.print(x+" ");
		  }
		  System.out.println();
		}
		
		public static void fill(Double[] array) {
			for(Double x : array) {
				 System.out.print(x+" ");
			}
			 System.out.println();
		}
		
		public static void fill(Character[] array) {
			for(Character x : array) {
				 System.out.print(x+" ");
			}
			 System.out.println();
		}
		
		public static void fill(String[] array) {
			for(int i = 0; i<array.length; i++) {
				 System.out.print(i+" ");
			}
			 System.out.println();
		}
		
		*/
		
		//Generics 
		public static <Things> void fill(Things[] array) {
			for(Things x : array) {
				 System.out.print(x+" ");
			}
			 System.out.println();
		}
	

}
