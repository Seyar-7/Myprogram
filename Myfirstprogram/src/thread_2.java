
public class thread_2 extends Thread{
	
	@Override
	public void run() {
		if(this.isDaemon()) {
			for(int i = 3; i>0; i--) {
				System.out.println(i);
		}
			System.out.println("This is a daemon thread that is running");
		}
		else {
			for(int j = 3; j>0; j--) {
		System.out.println(j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			System.out.println("This is a user thread that is running");
		}
	}

}
