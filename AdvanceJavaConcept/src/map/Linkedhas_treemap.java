package map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Linkedhas_treemap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lmp= new LinkedHashMap<Integer,String>();
		lmp.put(102, "orange");
		lmp.put(103, "apple");
		lmp.put(104, "banana");
		lmp.put(105, "stwaberry");
		lmp.put(106, "pinaapple");
		//lmp.put(102, "apple");
		System.out.println(lmp);

		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(107, "orange");
		tm.put(108, "apple");
		tm.put(109, "banana");
		tm.put(111, "stwaberry");
		tm.put(112, "pinaapple");
		//lmp.put(102, "apple");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.descendingMap());
	}

}
