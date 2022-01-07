import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OnlyPractice{

	public static void main(String[] args) throws InterruptedException {
		/*
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			int time = 10;
			@Override
			public void run() {
				if(time>0) { 
					
					System.out.println(time+" Sec");
					
					time--;
					
				}
				else {
				System.out.println("Happy New Year!!!");
				timer.cancel();
				}
			}
			
		};
		
		Calendar date = Calendar.getInstance();
		
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.AUGUST);
		date.set(Calendar.DAY_OF_MONTH, 6);;
		date.set(Calendar.HOUR_OF_DAY, 23);
		date.set(Calendar.MINUTE, 19);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		
		
		
		
		//timer.schedule(task, 3000);
		//timer.scheduleAtFixedRate(task, 0, 1000);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
      */
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the rows");
		
		int row = scan.nextInt();
		
		System.out.println("Enter the Columns");
		
		int columns = scan.nextInt();
		
		System.out.println("Enter the symbols");
		
		String symbols = scan.next();
		
		for(int i = 0; i<row;i++) {
			System.out.println();
			for(int j = 0; j<columns; j++) {
				System.out.print(symbols);
			}
			
		}
		*/
		
		
		threading1 thread1 = new threading1();
		
		threading2 runnable = new threading2();
		Thread thread2 = new Thread(runnable);
		
	    threading3 thread3 = new threading3();
		
		threading4 runnable1 = new threading4();
		Thread thread4 = new Thread(runnable1);
		
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		thread4.start();
	}


}
