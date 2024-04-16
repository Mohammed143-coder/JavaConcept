package assignments;

import java.util.Objects;
public class Stu_lib {

	String stu_name;
	int stu_id;
	double stu_fees;
	public Stu_lib(String stu_name, int stu_id, double stu_fees) {
		this.stu_name = stu_name;
		this.stu_id = stu_id;
		this.stu_fees = stu_fees;
	}
	@Override
	public int hashCode() {
		return stu_id;
		}
	@Override
	public String toString() {
		return stu_name+" "+stu_fees;
	}
	@Override
	public boolean equals(Object obj) {
		return this.stu_id==obj.hashCode();
		
	}
	}

