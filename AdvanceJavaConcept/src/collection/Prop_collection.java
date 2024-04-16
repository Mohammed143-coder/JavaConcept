package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Prop_collection {

	public static void main(String[] args) {
		ArrayList<Object>li=new ArrayList();
		li.add(101);
		li.add("mohammed");
		li.add(123456789);
		li.add('m');
		li.add("single");
		//li.remove(0);
		li.add(4,"waiting for spl");
		//li.addAll(li);
//		System.out.println(li);
//		System.out.println(li.size());
//		System.out.println(li.isEmpty());
//		System.out.println(li.get(4));
		for(int i=0;i<=li.size()-1;i++) {
			System.out.println(li.get(i));
		}
//Iterator <Object> it=li.iterator();
//while(it.hasNext()) {
//	
//}
	}

}
