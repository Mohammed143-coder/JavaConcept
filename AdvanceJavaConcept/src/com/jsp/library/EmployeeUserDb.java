package com.jsp.library;

import java.util.Objects;

public class EmployeeUserDb {
String emp_name;
int emp_id;
double emp_sal;
public EmployeeUserDb(String emp_name, int emp_id, double emp_sal) {
	this.emp_name = emp_name;
	this.emp_id = emp_id;
	this.emp_sal = emp_sal;
}
@Override
public int hashCode() {
	return emp_id;
	}
@Override
public String toString() {
	return emp_name+" "+emp_sal;
}
@Override
public boolean equals(Object obj) {
	return this.emp_id==obj.hashCode();
	
}

}
