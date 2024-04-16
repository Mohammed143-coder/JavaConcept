 package com.jsp.encapsulation;

public class Employee {
private String name;
private int Id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", Id=" + Id + "]";
}

}
