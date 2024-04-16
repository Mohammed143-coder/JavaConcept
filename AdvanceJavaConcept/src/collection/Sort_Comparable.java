package collection;

import java.util.ArrayList;
import java.util.Collections;


class Staff implements Comparable<Staff>{
	int Id;
	String name;
	
	public Staff(int id, String name) {
		Id = id;
		this.name = name;
	}


	@Override
	public int compareTo(Staff st) {
	
		return this.name.compareTo(name) ;
	}
	
}
		
		
public class Sort_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Staff>ar=new ArrayList<Staff>();
		ar.add(new Staff(101,"jun"));
		ar.add(new Staff(104,"un"));
		ar.add(new Staff(103,"jan"));
		ar.add(new Staff(102,"junaith"));
		
		Collections.sort(ar);
		
		for(Staff fet:ar) {
			System.out.println(fet.Id);
			}
		}
	}

