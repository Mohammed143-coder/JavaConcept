package exception;

import java.util.Scanner;

class MyException extends Exception {

	public MyException(String msg) {
		super(msg);// passing msg var to default Exception handler
	}
}

class Myown {
	public void check(int pwd) throws MyException {
		if (pwd == 123) {
			System.out.println("pwd validated");
		} else {
			throw new MyException("invalid");
			//throw is used to create an Excepton obj manually
			
		}
	}
}

class Customised_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Myown m = new Myown();
		int pwd = sc.nextInt();
		try {
			m.check(pwd);
		} catch (MyException e) {
			System.out.println(e);
		}

	}
}
