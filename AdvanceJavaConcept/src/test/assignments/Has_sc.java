package test.assignments;

import java.util.Scanner;

class Address{
	int door_no;
	String street;
	String area;
	String city ;
	
	public Address(int door_no, String street, String area, String city) {
		this.door_no = door_no;
		this.street = street;
		this.area = area;
		this.city = city;
	}
	public void display() {
		System.out.println("customer door no.:"+door_no);
		System.out.println("customer street:"+street);
		System.out.println("customer area:"+area);
		System.out.println("customer city:"+city);
	}
}
class customer{
	String name;
	long cus_no;
	String e_id;
	Address a1=new Address(185,"Babasaibu","londenpet","Krishnagiri");
	public customer(String name, long cus_no, String e_id) {
		this.name = name;
		this.cus_no = cus_no;
		this.e_id = e_id;
	}
	}
public class Has_sc {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter details to fetch...");
		System.out.println("Enter name....");
		String name=s1.next();
		System.out.println("Enter cus_no...");
		long cus_no=s1.nextLong();
		System.out.println("Enter E_id....");
		String E_id=s1.next();
		customer c1=new customer(name,cus_no,E_id);
		c1.a1.display();
		}

}
