package threads;


class Test1 extends Thread{
	int amt1=0;

	public void run() {
		synchronized(this) {
	for(int i=1;i<=10;i++) {
		amt1=amt1+100;
	}
	this.notify();

		}

//	System.out.println(amt1);
}
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.start();
		synchronized(t1) {
			t1.wait();
		}
		System.out.println(t1.amt1);
	}

}

