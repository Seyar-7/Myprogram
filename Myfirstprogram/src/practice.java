import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("sum");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x-y);
		*/
		/*
	  int sey=10;//morid
	   int mor=12;//ehsan
	   int eman=15;//seyar
	   int ehsan=7;//eman
	    int fill;
	    fill=sey;//10
	    sey=eman;//15
	    eman=ehsan;//7
	    ehsan=mor;//12
	    mor=fill;//10
	    
	    System.out.println(+sey);
	    System.out.println(+mor);
	    System.out.println(+eman);
	    System.out.println(+ehsan);
	    */
		/*
	   Scanner scan = new Scanner(System.in);
	   System.out.println("plz type numbers from 1-6");
	   Random rand = new Random();
	    
	    int a;
	    a = scan.nextInt();
	   while (a != rand.nextInt(6)+1) {
	    	System.out.println("try agin");
	    	a = scan.nextInt();
	    }
	   System.out.print("you win the game!");
        */
	   
	/*	
		String name;
		String ex;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("what is your full name: ");
		name = scan.nextLine();
		System.out.println("Good day mr/mrs: "+name);	
		System.out.print("how old are you: ");
	     age = scan.nextInt();
	     if(age <=17) {
	    	 System.out.println("sorry you are not allow to this company cuz you are under 18");
	     }
	     else {
	    	    
	    		 scan.nextLine();
	    		 System.out.print("do you have experince: ");
	    		 ex = scan.nextLine();
	    		 if(ex.equalsIgnoreCase("no")) {
	    			 System.out.println("welcome "+name+" your age is enough for this company");	
	    			 System.out.print("sorry you don't have any experince: ");
	    		 }else {
	    			 System.out.println("welcome "+name+" your age is enough for this company");
	    			 System.out.print("your work start on 8:00 0.clock");
	    		 }
	    			
	    	
	     }
	     */
	   /*	
		ArrayList<ArrayList<String>> allcars = new ArrayList<>();
		
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("buggati");
		cars.add("lambo");
		cars.add("tesla");
		cars.set(1, "Ferrari");
		cars.add("lambo");
		
		ArrayList<String> oldcars = new ArrayList<>();
		oldcars.add("toyota 2001");
		oldcars.add("toyota 2000");
		
		allcars.add(oldcars);
		allcars.add(cars);
	
		
		for(String i:allcars.get(0)) {
			System.out.println(i);
		}
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(23);
		number.add(33);
		number.add(55);

		
		for(Integer j:number) {
			System.out.println(j);
		}
		*/
		
	/*	
	 int y = 4;
	 int x = 6;
	  System.out.println(sum(x,y));
	   */
		
		/*  
		practice_2 name = new practice_2();
		
		System.out.println(name.name+" "+name.last);
		
		System.out.println("this is "+name.name+" "+name.last+" i am "+name.age+" years old i would like to work"
				+ " on this company as a "+name.ability+" \nThanks!");
	    name.male();
	    name.female();
		*/
		
		
		/*
		practice_3 prac = new practice_3();
		
	    prac.drink();
		*/
		
		
		/*practice_2 intro;
		intro = new practice_2("seyar","joyandah",22);
		
		System.out.print("my name is "+intro.name+" "+intro.last+ " and iam "+intro.age+" years old and ");
		*/
		
		/*
		//Random 
	    
	    Random rand = new Random();
	    int num;
        int num1;
        
        num = rand.nextInt(6)+1;
        num1 = rand.nextInt(6)+1;
        
        int [] [] arr = new int[2][2];
        
        arr[0][0] = num;
        arr[0][1] = num*num;
        arr[1][0] = num1;
	    arr[1][1] = num1*num1*num;
	     
	    
	    System.out.println(arr[0][0]);
	    		System.out.println(arr[0][1]);
	    				System.out.println(arr[1][0]);
	    						System.out.println(arr[1][1]);
	    						System.out.println("\n");
	    						
	     for(int i=0; i<arr.length;i++) {
	    	 for(int j=0;j<arr[i].length;j++) {
	    		 System.out.println(arr[j][i]);
	    	 }
	    	 
	     }
	     */
		
		/*
		practice_3 me = new practice_3("seyar",22,"baryalai");
		practice_3 me1 = new practice_3("wali",31,"toryalai");
		System.out.println("this is "+me.name+" i am "+me.age+" my brother name is "+me.bro);
		System.out.println(me1.toString());
		practice prac = new practice();
		*/
		
		practice_2 car = new practice_2("land curiser","toyota",2020);
		//practice_2 car1 = new practice_2("4runner","toyota",2021);
		//car1.copy(car);
		practice_2 car1 = new practice_2(car);
		System.out.println(car);
		System.out.println(car1);
		//car.setmake("4Runner");
		car.setyear(2009);
		
		
		System.out.println(car1.getmake());
		System.out.println(car1.getmodel());
		System.out.println(car1.getyear());
	    System.out.println();
		System.out.println(car.getmake());
		System.out.println(car.getmodel());
		System.out.println(car.getyear());
		
	
		System.out.println("---------------------------");
		
		
		int[] arr = {1,2,4,6,8,10};
		
		int sum =0;
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			
			res = arr[i];
		//	System.out.println(res);
			
			sum +=res;
			//System.out.println(sum);
		}
		System.out.println(sum);
		
	}
	
	/*
	static int sum(int x, int y) {
		
		return x*y;
	}
	*/

}
