package oops_prog;

abstract class junaith{
	abstract public void login();
	abstract public void logout();
} 
class customer extends junaith{

	@Override
	public void login() {
		System.out.println("Customer login sucessfully!!!");		
	}

	@Override
	public void logout() {
		System.out.println("Customer logout sucessfully!!!");
	}
}
	class admin extends junaith{

		@Override
		public void login() {
			System.out.println("admin logout sucessfully!!!");
		}
		@Override
		public void logout() {
			System.out.println("admin logout sucessfully!!!");
		}	
	}
public class Main_abstract {
public static void main(String[] args) {
	customer c1=new customer();
	c1.login();
	c1.logout();
	System.out.println("_________________");
	admin d=new admin();
	d.login();
	d.logout();
	
}
}
