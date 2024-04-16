package oops_prog;

class Gmail{
	Gmail(String name){
	System.out.println(name);
	}
	Gmail(String name,long contact_no){
		System.out.println(name+" "+contact_no);
	}
	Gmail(String name,long contact_no,int pwd){
		System.out.println(name+" "+contact_no+" "+pwd);
	}
}
public class Cons_overloa {

	  public static void main(String[] args) {
		Gmail g1=new Gmail("Abc");
		Gmail g2=new Gmail("Abc",123456789l);
		Gmail g3=new Gmail("Abc",123456789l,123);

	}

}
