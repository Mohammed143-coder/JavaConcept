package map;

import java.util.HashMap;

public class Map_food {

	public static void main(String[] args) {
	HashMap<String,Double > foditm=new HashMap<String,Double >();

	foditm.put("phal",125.00);
	foditm.put("Biriyani",115.00);
	foditm.put("liondates",135.00);
	foditm.put("Roohafza",105.00);
	System.out.println("\n"+foditm);
	System.out.println("\nSerching food list of items keys or names \n");
	if(foditm.containsValue(125.00)) {
		System.out.println("The food contains key Phal ");
	}
	else {
		System.out.println("The foodCart does not contains key");
	}
	if(foditm.containsKey("Roohafza")) {
		System.out.println("\nThe foodCart contains Roohafza");
	}
	else {
		System.out.println("The foodCart does not contains key");
	}
	}

}
