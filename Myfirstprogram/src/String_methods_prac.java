
public class String_methods_prac {
         public static void main(String[] args) {
        	 
        //String = a reference data type that can store one or more characters
            // referecne data type have access to useful methods
        	 
        String name = "    seyar";
        
      //  boolean result = name.equals("seyar");//true
      //  boolean result = name.equalsIgnoreCase("SeYaR");//true
      //  char result = name.charAt(0);//s
      //  int result = name.indexOf("y");//2
      //  boolean result = name.isEmpty();//false
      //  String result = name.toLowerCase();//seyar
      //  String result = name.toUpperCase();//SEYAR
      //  String result = name.trim();//remove all spaces
      //  String result = name.replace("seyar","morid").trim();
        //	 System.out.print(result);
        
       /* 
        String mine = "12345678901";
        System.out.println("length "+mine.length());
       System.out.println("division "+ mine.length()/3);
       System.out.println("remainder "+mine.length()%2);
       int helo  = 2;
       
       if(mine.length()%2 ==0) {
    	   System.out.println("-");
       }else {
    	        System.out.println(mine.charAt(mine.length()/2));
       }
   
             
        String name2 = "1234567891";
        if(name2.length()%2 == 0) {
        System.out.println("Error");
        }else {
        	System.out.println(name2.charAt(name2.length()/2));
        }
        
        */
        
        
        String name3 = "Dog bites Man";
        String rev = "";
        
        
        System.out.println(reverse(name3));
        
       // System.out.println(rev);
  
        
         }
         public static String reverse(String name3) {

             StringBuilder build = new StringBuilder();
            for(int i = 0; i<name3.length(); i++) {
            	int start = i;
            	System.out.println(start);
            	while(i<name3.length() && name3.charAt(i) !=' ')i++;
            	System.out.println(i);
            	if(build.length() == 0) {
            	    build.insert(0, name3.substring(start, i));
            	}else {
            	    build.insert(0, " ").insert(0,name3.substring(start, i));

            	}
            }
            	return build.toString();
                   
         }
}
