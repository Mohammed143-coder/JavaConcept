package assignments;

class Myphone_child{
	public void phone() {
		System.out.println("I used my dad phone");
	}
}
class Myphone_teen extends Myphone_child{
	
	public void phone() {
		System.out.println("I used my bro phone");
	}
}
class Myphone_endteen extends Myphone_child{
	
	public void phone() {
		System.out.println("I got my  phone");
	}
}
class Myphone_20s extends Myphone_teen{
	
	public void phone() {
		System.out.println("I got new  phone");
}}
public class Hyb_overri {

	public static void main(String[] args) {
		Myphone_20s m2=new Myphone_20s();
	     m2.phone();
	}
}