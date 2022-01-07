import java.util.Scanner;

public class Switch_statement_Prac {
      public static void main(String[]  args){
    	  // Switch = statement that allows a variable to be tested for equality against a list of values
    	  
    	  
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("choice days of the week");
    	   String day;
    	   day = scan.next();
    			   
    	   switch(day){
    		   case "satarday":System.out.println("today is a weekend becouse it is "+day);
    		   break;
    		   case "sunday":System.out.println("today is a weekend becouse it is "+day);
    		   break;
    		   case "monday":System.out.println("today is "+day);
    		   break;
    		   case "tusday":System.out.println("today is "+day);
    		   break;
    		   case "wendsday":System.out.println("today is "+day);
    		   break;
    		   case "thursday":System.out.println("today is "+day);
    		   break;
    		   case "friday":System.out.println("tommorow will be sunday it means today is "+day);
    		   break;
    		   default:System.out.println(day+" is not the day");
    		  
    	   }
      }
      
      
}
