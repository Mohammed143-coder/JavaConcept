package oops_prog;

public class Try_multi_catch {
	public static void test(int num) {
		try {
			int[] a = { 10, 20, 30, 40, 50 };
			System.out.println(a[5]);
			
			try {
				int res = 100 / num;
				System.out.println(res);
		}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array error");
		}
		} 
	catch (ArithmeticException ae) {
		System.out.println("invalid opt");
		
		}
	}

	public static void main(String[] args) {
		//test(10);
		test(0);

	}

}
