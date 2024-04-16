package collection;

import java.util.Comparator;
import java.util.TreeSet;

class studentInfo{
	String name;
	int Id;
	public studentInfo(String name, int id) {
		this.name = name;
		Id = id;
	}
	@Override
	public String toString() {
		return "studentInfo [name=" + name + ", Id=" + Id + "]";
	}
}
class StudentDb implements Comparator<studentInfo>{

	@Override
	public int compare(studentInfo s1, studentInfo s2) {
		return s1.Id-s2.Id;
	}	
}
public class Customized_sorting {

	public static void main(String[] args) {
		studentInfo s1=new studentInfo("dinga",101);
		studentInfo s2=new studentInfo("dingi",103);
		studentInfo s3=new studentInfo("dingu",102);
		StudentDb sd=new StudentDb();
		TreeSet<studentInfo>ts=new TreeSet<studentInfo>(sd);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.forEach(obj->System.out.println(obj));
	}

}
