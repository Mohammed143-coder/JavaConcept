package threads;

class Threadimplement implements Runnable{
	@Override
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}
	System.out.println(Thread.currentThread().getPriority());
}}
public class ImplementArunnable {

	public static void main(String[] args) {
		Threadimplement t =new Threadimplement ();
		Thread td=new Thread(t);
		System.out.println(td.currentThread());
		td.setPriority(6);
		td.start();
		
	}

}
