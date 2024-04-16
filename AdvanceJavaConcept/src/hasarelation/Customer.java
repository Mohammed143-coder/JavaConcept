package hasarelation;

public class Customer {
String name;
long mob_no;
String email_id;
Address ad=new Address(10,"food street","basavanagudi","banglore",560004);

public Customer(String name, long mob_no, String email_id) {
	this.name = name;
	this.mob_no = mob_no;
	this.email_id = email_id;
	
}

public void show_cust_details() {
	System.out.println("Customer name is:"+name);
	System.out.println("Customer Mob_no is:"+mob_no);
	System.out.println("Customer Email_id is:"+email_id);
}
}
