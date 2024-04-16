package oops_prog;

public class Type_casting {

	public static void main(String[] args) {
		System.out.println("Conversion starts...");
		System.out.println("****Widening****");
		char i1='a';
		//short d1=i1;
		
		System.out.println("The value of i1:"+i1);
		//System.out.println("The value of d1:"+d1);
		System.out.println("--------------------");
		System.out.println("_____Narrowing_____");
		double d2=2340076.11;
		short i2=(short)d2;
		
		float f1=123l;
		System.out.println("The value of i1:"+d2);
		System.out.println("The value of d1:"+i2);
	}

}
