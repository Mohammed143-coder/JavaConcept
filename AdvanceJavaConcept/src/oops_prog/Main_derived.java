package oops_prog;

class sample{
	public void show(sample s1) {
		System.out.println("im a sample test");
	}
	public void show(demo d1) {
		System.out.println("im a show class display");}
}
class demo extends sample{
	
	public void show(demo d2) {
		System.out.println("im d1 class show");

}}
class demo1 extends sample{
	public void disply(demo1 d2) {
		System.out.println("Im method of disply ");
	}
}
public class Main_derived {

	public static void main(String[] args) {
		demo d1=new demo();//tight looping
		sample s1=new demo();//upcasting
		demo d2=(demo)s1;//downcasting
		demo1 e1=(demo1)s1;//class cast expectation
		System.out.println(s1 instanceof demo );
		//d2.show(d2);
	//	d2.show(d1);
	}

}
