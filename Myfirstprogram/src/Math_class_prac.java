import java.util.Scanner;
public class Math_class_prac {
    public static void main(String[] args){
    	
    	
    	double pi = 3.14;
    	double r = -10;
    	double sq = 25;
    	Math.max(pi, r);//3.14
    	Math.min(pi, r);//-10
    	Math.abs(r);//10
    	Math.sqrt(sq);//5
    	Math.ceil(pi);//4
    	Math.round(pi);//3
    	Math.floor(pi);//3
    	
    	
    	//project
    	double x;
    	double y;
    	double z;
    	
    	Scanner scan= new Scanner(System.in);
    	
    	System.out.println("enter side x:");
        x=scan.nextDouble();
    	System.out.println("enter side y:");
        y=scan.nextDouble();
    	z = Math.sqrt((x*x)+(y+y));
    	System.out.println("the hypotenuse is :"+z);
    		}
}
