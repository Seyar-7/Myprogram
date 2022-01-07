
public class multithreading {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		   MultiThreading =          Process of executing multiple threads simultaneously
		                             Help maximum utilization of CPU 
		                             Threads are independent, they don't affect the execution of other threads.
		                             An exception in one thread will not interrupt other threads
		                             useful for serving multiple clients, multiplayer games, or other mutually independent task 
		 */
		
		
		// Create a subclass of Thread.
		multithreading2 thread1 = new multithreading2();
		 
		
		//or
		
		// implement Runnable interface and pass instance as argument to Thread().
	    multithreading3 runnable = new multithreading3();
		Thread thread2 = new Thread(runnable);
	
//		thread1.setDaemon(true);
//		thread2.setDaemon(true);
		
		
		thread1.start();
	    //thread1.join(3000);//Calling thread (ex.main) wait until the specified thread dies or for x milliseconds.
		thread2.start();

	}

}
