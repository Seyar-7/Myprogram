
public class threading4 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 31; i<=40; i++) {
		
			System.out.println("Thread#4_"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread#4 finished");
		
	}

}
