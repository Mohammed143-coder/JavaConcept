package oops_prog;

class junaith_v1{
	public void style(String ring) {
		System.out.println("junaith use at past:"+ring);
	}
}
class junaith_v2 extends junaith_v1{
	public void style (String ring,long money) {
		System.out.println("junaith updated:"+ring+" "+money+"k");
	}
}
class junaith_v3 extends junaith_v2{
	public void style (String ring,long money,String nic_nam) {
		System.out.println("junaith latest update:"+ring+" "+money+"k"+nic_nam);
	}
}
public class Multilev_methove {

	public static void main(String[] args) {
		junaith_v3 jr=new junaith_v3();
		System.out.println("junaith updates...");
		jr.style("Silver ring");
		jr.style("Silver ring"+" ",2l);
		jr.style("Silver ring", 2l," "+"junaith_amyr");
		

	}

}
 