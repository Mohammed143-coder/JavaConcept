package abstraction;

public class Chocolatecal {
public  Chocolate gen_amount(int amount) {
	Chocolate mil;
	if(amount<10&&amount>=8) {
		mil=new customer();
		return mil;
	}
	else {
		mil=new shopkeeper();
		return mil;
	}
}
}
