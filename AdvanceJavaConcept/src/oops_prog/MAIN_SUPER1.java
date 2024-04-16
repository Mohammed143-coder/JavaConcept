package oops_prog;

class Gmailv1{
 String name;

public Gmailv1(String name) {
	this.name = name;
}	
public void show_details() {
	System.out.println("...Hii...");   }
}
class Gmailv2 extends Gmailv1{
	long mob_no;

	public Gmailv2(String name, long mob_no) {
		super(name);
		this.mob_no = mob_no; } 
	} 
class Gmailv3 extends Gmailv2{
	int pwd;
	public Gmailv3(String name, long mob_no, int pwd) {
		super(name, mob_no);
		this.pwd = pwd;  }
	public void show() {
		System.out.println("User name:"+name);
		System.out.println("User mob_no:"+mob_no);
		System.out.println("User pwd:"+pwd);
	}
}
	public class MAIN_SUPER1 {
		public static void main(String[] args) {
			Gmailv3 g3=new Gmailv3("junaith",9087305621l,7860);
			g3.show();
			g3.show_details();
				}
}
