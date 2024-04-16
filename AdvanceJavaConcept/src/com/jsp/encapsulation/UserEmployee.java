package com.jsp.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserEmployee {

	public static void main(String[] args) {
		System.out.println("Enter The Emp id & name....");

		Scanner s1 = new Scanner(System.in);

		int Id = s1.nextInt();
		String name = s1.next();
		Employee e1 = new Employee();
		e1.setId(Id);
		e1.setName(name);
		
		Employee e2 = new Employee();
		e2.setId(Id);
		e2.setName(name);
		
		Employee e3 = new Employee();
		e3.setId(Id);
		e3.setName(name);
		
		ArrayList<Object> arl=new ArrayList<>();
		arl.add(e1);
		arl.add(e2);
		arl.add(e3);
		
	for (Object E : arl) {
		System.out.println(E);
		
	}
		
		

	}

}
