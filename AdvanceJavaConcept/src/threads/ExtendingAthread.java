package threads;

public class ExtendingAthread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ExtendingAthread ex = new ExtendingAthread();
		System.out.println(Thread.currentThread());
		// ex.setPriority(MAX_PRIORITY);
		// ex.setPriority(MIN_PRIORITY);
		// ex.setPriority(NORM_PRIORITY);
		ex.setPriority(3);
		ex.start();
	}
}
