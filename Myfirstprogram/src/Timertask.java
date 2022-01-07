import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Timertask {

	public static void main(String[] args) {
		
		/*
		  Timer = A facility for threads to schedule tasks 
		          for future execution in a background thread.
		          
		  
		  TimerTask = A task that can be scheduled for one-time
		              or repeated execution by a timer.
		 */
		
		   Timer timer = new Timer();
		   
		   TimerTask task = new TimerTask(){
			   
		  
            int sec = 10;
			@Override
			public void run() {
				 if(sec>0) {
				 System.out.println(sec+" second");
			      
				 sec--;
				 }
				 else {
					 System.out.println("Happy New Year!!");
					 timer.cancel();
				 }
			}	  
		   };

		   
		   Calendar date = Calendar.getInstance();
		   date.set(Calendar.YEAR,2021);
		   date.set(Calendar.MONTH, Calendar.AUGUST);
		   date.set(Calendar.DAY_OF_MONTH, 4);
		   date.set(Calendar.HOUR_OF_DAY, 23);
		   date.set(Calendar.MINUTE, 22);
		   date.set(Calendar.SECOND, 20);
		   date.set(Calendar.MILLISECOND, 0);
		   
		   //timer.schedule(task, 3000);
		  // timer.schedule(task, date.getTime());
		//  timer.scheduleAtFixedRate(task, 0, 1000);
		//   timer.scheduleAtFixedRate(task, date.getTime(), 1000);

		 
	}

}
