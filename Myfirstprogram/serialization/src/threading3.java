
public class threading3 extends Thread{
	
	public void run() {
		for(int i = 21; i<=30; i++) {
			System.out.println("Thread#3_"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread#3 finished");
	}

}
