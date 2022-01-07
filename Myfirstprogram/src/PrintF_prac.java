
public class PrintF_prac {
    public static void main(String[] args) {
    	
    	/* Printf() = an optional method to control, format and display text to the console window
    	              two arguments = format string + (object/variable/value) 
    	              % [flags] [percision] [width] [conversion-character]
    	  
    	 */
     	
    	boolean myboolean = true;
    	char mychar = '@';
    	String mystring = "seyar";
    	int myint = 50;
    	double mydouble = 10000;
    	
    	//[conversion - character]
    	/*
    	System.out.printf("%b",myboolean);
    	System.out.printf("%c",mychar);
    	System.out.printf("%s",mystring);
    	System.out.printf("%d",myint);
    	System.out.printf("%f",mydouble);
    	*/
    	
    	//[width]
    	//minimum number of characters to be written as output
    	//System.out.printf("Hello %-10s",mystring);
    	
    	//[percision]
    	//sets number of digits of percision when outputting floating point values
    	//System.out.printf("You have this much money %2f",mydouble);
    	
    	//[flags]
    	//adds on effect to output based on the flag added to format specifier
    	// - : left - justify
    	// + : output a plus ( + ) or minus ( - ) sign for a numeric value
    	// 0 : numeric values are zero-padded
    	// , : comma grouping separator if numeric > 1000
    	
    	System.out.printf("You have this much money %,1f",mydouble);
    	System.out.println();
    	System.out.printf("You have this much money %020f",mydouble);
    }
}
