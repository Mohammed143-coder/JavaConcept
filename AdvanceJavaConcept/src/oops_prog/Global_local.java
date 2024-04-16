package oops_prog;

class sample1{
	int a1;//global
	public void test(int b) {
		int b1=1;
		System.out.println("hello!!!");
		System.out.println(a1);
		System.out.println(b);
		System.out.println(b1);
	}
}
public class Global_local {

	public static void main(String[] args) {
sample1 s1=new sample1();
System.out.println(s1.a1);


	}

}
