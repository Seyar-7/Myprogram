
public class multithreading3 implements Runnable{

	@Override
	public void run() {
	
	for(int i = 0; i<10; i++) {
			
			System.out.println("Thread#2_"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread#2 finished!!");
		
	}

}
