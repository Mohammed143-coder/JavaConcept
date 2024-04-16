package oops_prog;

import java.util.Scanner;

class Mj1{
	String name;

	public Mj1(String name) {
		this.name = name; }	
}
class Mj2 extends Mj1{
	long mob_no;

	public Mj2(String name, long mob_no) {
		super(name);
		this.mob_no = mob_no; 

		System.out.println("user mob_no:"+mob_no); }
}
class Mj3 extends Mj1{
	int pwd;

	public Mj3(String name, int pwd) {
		super(name);
		this.pwd = pwd;
	
			}
}
class Mj3s extends Mj3{
	String Hint;

	public Mj3s(String name, int pwd, String hint) {
		super(name, pwd);
		Hint = hint;
		System.out.println("user name:"+name);
		System.out.println("user pwd:"+pwd);
		System.out.println("user hint:"+hint); }
}
public class Main_hybrid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter deatils to be MJ memb....");
		System.out.println("Enter name of user....");
		String name=sc.next();
		System.out.println("Enter pwd....");
		int pwd=sc.nextInt();
		System.out.println("Enter mob no....");
		long mob=sc.nextLong();
		
		System.out.println("Enter user sec hint....");
		String hint=sc.next();
		Mj3s m1= new Mj3s(name,pwd,hint);
	Mj2 m2=new Mj2(name,mob);
	}
}
