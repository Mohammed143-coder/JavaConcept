package flowcontrol_stmt;

public class Nested_ifelseif {
	public static void test(int num1, int num2) {
		if (num1 < 30) {
			if (num2 > 30) {
				System.out.println("greater");
			} else if (num2 == 30) {
				System.out.println("equal");
			} else {
				System.out.println("lesser");
			}
			System.out.println("lesser");
		} else if (num1 == 30) {
			System.out.println("equal");
		} else {
			System.out.println("greater");
		}
	}

	public static void main(String[] args) {
		test(10, 40);
		System.out.println("-------");
		test(40, 10);
		System.out.println("-------");
		test(20, 30);
		System.out.println("-------");
		test(30, 40);
	}

}