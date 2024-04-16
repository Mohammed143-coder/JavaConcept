package hasarelation;

public class Address {
	int doorno;
	String Street;
	String area;
	String city;
	int pincode;
	public Address(int doorno, String street, String area, String city, int pincode) {
		this.doorno = doorno;
		this.Street = street;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
public void show_address() {
	System.out.println("door no is:"+" "+doorno);
	System.out.println("Street is:"+" "+Street);
	System.out.println("Area is:"+" "+area);
	System.out.println("City is:"+" "+city);
	System.out.println("Pincode is:"+" "+pincode);
	
}
}
