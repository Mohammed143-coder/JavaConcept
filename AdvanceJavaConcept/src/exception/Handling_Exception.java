package exception;


public class Handling_Exception {

	public static void main(String[] args) {
		
		Handling_Exception he=new Handling_Exception();
		try {
		he.divide();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");	
	}
	void divide()throws ArithmeticException  {
		int a=10,b=0,c,d;
		 c=a/b;
		 
		
		 
		 
	}
	
	

}
