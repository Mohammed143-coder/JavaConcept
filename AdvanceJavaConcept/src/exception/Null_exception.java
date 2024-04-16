package exception;

public class Null_exception {
	static int a=10;
	public void show() {
		System.out.println("null exception");
	}
	public static void main(String[] args) {
		Null_exception n1= null;
		//n1=null;
		n1.show();
	}

}
