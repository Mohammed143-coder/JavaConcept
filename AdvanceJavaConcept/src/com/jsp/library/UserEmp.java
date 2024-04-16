package com.jsp.library;
import java.util.Scanner;

public class UserEmp {

	public static void main(String[] args) {
		System.out.println("enter emp details...");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter emp name...");
		String name=s1.next();
		System.out.println("Enter emp id...");
		int id=s1.nextInt();
		System.out.println("Enter emp sal...");
		double sal=s1.nextDouble();
		EmployeeUserDb s2=new EmployeeUserDb (name,id,sal);
		System.out.println(s2.hashCode());
		System.out.println(s2.toString());
		System.out.println("-------------------");
		System.out.println("Enter emp name...");
		String name1=s1.next();
		System.out.println("Enter emp id...");
		int id1=s1.nextInt();
		System.out.println("Enter emp sal...");
		double sal1=s1.nextDouble();
		EmployeeUserDb s3=new EmployeeUserDb (name1,id1,sal1);
		System.out.println(s3.hashCode());
		System.out.println(s3.toString());

	}

}
