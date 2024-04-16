package threads;

class TestThread1 extends Thread {
	TestThread t1;

	TestThread1(TestThread t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.div(100);

		System.out.println(Thread.currentThread().getPriority());

	}
}

public class TestThread2 extends Thread {
	TestThread t2;

	public TestThread2(TestThread t2) {
		this.t2 = t2;
	}

	@Override
	public void run() {
		t2.div(50);
		System.out.println(Thread.currentThread().getPriority());
	}
}
