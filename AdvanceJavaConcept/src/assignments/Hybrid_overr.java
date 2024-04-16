package assignments;

//hydrid constructor overloading
class Mj1{
	String name;

	 Mj1(String name) {
		this.name = name; }	
}
class Mj2 extends Mj1{
	long mob_no;

	 Mj2(String name, long mob_no) {
		super(name);
		this.mob_no = mob_no; 
		System.out.println("user name:"+name);
		System.out.println("user mob_no:"+mob_no); }
}
class Mj3 extends Mj1{
	int pwd;

	 Mj3(String name, int pwd) {
		super(name);
		this.pwd = pwd;}
}
class Mj3s extends Mj3{
	String Hint;

	 Mj3s(String name, int pwd, String hint) {
		super(name, pwd);
		Hint = hint;
		System.out.println("user name:"+name);
		System.out.println("user pwd:"+pwd);
		System.out.println("user fvt tech:"+hint); }
}
public class Hybrid_overr {
public static void main(String[] args) {
	Mj3s m1=new Mj3s("junaith",1234,"sumaiya");
	Mj2 m2=new Mj2("junaith",9626780534l);
}
}
