package map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_Eg {

	public static void main(String[] args) {
	HashMap<Integer,String> hsm=new HashMap<Integer,String>();
	hsm.put(90, "Dairymilk");
	hsm.put(40, "Dairymilk");
	hsm.put(90, "Dairymilk");
	hsm.put(90, "Dairymilk");
	
	
	Set<Integer>key=hsm.keySet();
	hsm.forEach(null);
	

	}
			

}
