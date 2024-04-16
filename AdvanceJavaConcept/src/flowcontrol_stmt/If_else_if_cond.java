package flowcontrol_stmt;

public class If_else_if_cond {
	public static void test(int num) {
	if(num>50) {
		System.out.println("The number is greater: "+num);
	}
	 else if(num==50) {
		System.out.println("The number is equal: "+num);
	}
	 else {
		 System.out.println("the number is lesser: "+num);
	 }
	}

	public static void main(String[] args) {
		test(60);
		test(50);
		test(10);
	}

}
