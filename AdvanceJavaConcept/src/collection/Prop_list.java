package collection;
import java.util.ArrayList;
import java.util.List;

public class Prop_list {

	public static void main(String[] args) {
		List<Object>li=new ArrayList<Object>();
		li.add(10);
		li.add(10);
		li.add("abc");
		li.add(null);
		li.add(null);
		System.out.println(li);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}

}
