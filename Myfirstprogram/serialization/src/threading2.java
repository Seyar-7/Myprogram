
public class threading2 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 11; i<=20; i++) {
		
			System.out.println("Thread#2_"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread#2 finished");
		
	}

}
