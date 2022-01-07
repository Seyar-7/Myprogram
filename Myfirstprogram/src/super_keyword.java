
public class super_keyword {
       public static void main(String[] args) {
    	   
    	   super_keyword_brother bro = new super_keyword_brother("seyar", 22 ,"baryalai");
    	   super_keyword_brother bro1 = new super_keyword_brother("seyar", 23,"wali");
    	   System.out.println("My name is "+bro.name+" i am "+bro.age+" years old and my brother name is "+bro.brother);
    	   System.out.println("My name is "+bro1.name+" i am "+bro1.age+" years old and my brother name is "+bro1.brother);
           System.out.println(bro.toString());
    	   
       }
}
