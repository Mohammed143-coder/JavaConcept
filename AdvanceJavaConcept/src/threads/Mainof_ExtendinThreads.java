package threads;

public class Mainof_ExtendinThreads {

	public static void main(String[] args) {
		TestThread t = new TestThread();

		TestThread1 th1 = new TestThread1(t);

		th1.setName("ThreadOne");
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TestThread2 th2 = new TestThread2(t);
		th2.setName("ThreadTwo");

		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Game end.......");

	}
}
