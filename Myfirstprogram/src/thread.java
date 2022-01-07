
public class thread {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		  A thread of execution in a program (kind of like a virtual CPU)
		  The JVM allows an application to have multiple threads running concurrently
		  Each thread can execute parts of you code in parallel with the main thread
		  Each thread has a priority.
		  Thread with higher priority are executed in preference compared to threads with a lower priority
		  
		  The Java Virtual Machine continues to executes threads until either of the following occurs 
		       1. The exit method of class runtime has been called
		       2. All user threads have died
		      
		  When a JVM start up, there is a thread which calls the main method
		  This thread is called "main"
		  
		  Daemon thread is a low priority thread that runs in background to perform tasks such a garbage collection
		  JVM terminates itself when all user threads (non-daemon threads) finish their execution. 
		  
		 */
		
		
		
		//System.out.println(Thread.activeCount());
		
//		Thread.currentThread().setName("MAIN");
//		System.out.println(Thread.currentThread().getName());
//		
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
//		
//		System.out.println(Thread.currentThread().isAlive());
	/*	
		for(int i = 3; i>0; i--) {
			
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("DONE!!!!!");
		*/
		
		thread_2 thread2 = new thread_2();
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
     	thread2.start();
//		System.out.println(thread2.isAlive());
		
//		thread2.setName("thread2");
//		System.out.println(thread2.getName());
		
//		thread2.setPriority(1);
//		System.out.println(thread2.getPriority());
		

		
		

	}

}
