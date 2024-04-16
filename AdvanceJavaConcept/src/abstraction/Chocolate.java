package abstraction;

interface Chocolate {
 void lollipop();
 void chocoki();
}
class customer implements Chocolate{

	@Override
	public void lollipop() {
		System.out.println("customer bought lollipop");	
	}
	@Override
	public void chocoki() {
		System.out.println("customer bought choco_choki");
	}
}
class shopkeeper implements Chocolate{

	@Override
	public void lollipop() {
		System.out.println("shopkeeper not gave lollipop");
		
	}

	@Override
	public void chocoki() {
		System.out.println("shopkeeper not gave choco_choki");
		
	}}