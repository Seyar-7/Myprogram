
public class Method_prac {
       public static void main(String[] args) {
    	   
    	   //Method = a block of code that is executed whenever it is called upon
    	   
    	   String name = "seyar";
    	   int age = 22;
    	 hello(name,age);
    	 
    	 int x = 7;
    	 int y = 9;
    	 
    	 
    	 System.out.println(sum(x,y));
       }
       
         static void hello(String name, int age) {
    	   System.out.println("hello "+name);
    	   System.out.println("you are "+age);
    	   
    	   
       }
         static int sum(int x , int y ) {
        	 
        	 return x + y;
        	 
         }
         
       
       
}
