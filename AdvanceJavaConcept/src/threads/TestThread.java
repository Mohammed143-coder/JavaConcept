package threads;

public class TestThread {
   public void div(int num) {
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(num/i);
		
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
}
