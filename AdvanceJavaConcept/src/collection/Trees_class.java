package collection;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class Trees_class {

	public static void main(String[] args) {
		SortedSet<Object>so=new TreeSet<Object>();
		so.add('D');
		so.add('C');
		so.add('B');
		so.add('A');
		System.out.println(so);
		TreeSet<Object>tr=new TreeSet<Object>();
		tr.add("chat");
		tr.add("vdcall");
		tr.add("vcall");
		System.out.println(tr);
		NavigableSet<Object>nv=new TreeSet<Object>();
		nv.forEach(obj->System.out.println(obj));
		System.out.println(nv.descendingSet());
	}

}
