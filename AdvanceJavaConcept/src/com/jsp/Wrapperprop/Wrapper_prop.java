package com.jsp.Wrapperprop;

public class Wrapper_prop {

	public static void main(String[] args) {
		int j=11;
		 Integer i=new Integer(j);
		 System.out.println(i);		//boxing
		 
		int j1=10;
		 Integer i2=j;
		 System.out.println(j1);		//Auto Boxing
		 
		Integer i1=new Integer(20);
		int j2=i1;					
		System.out.println(j2);		//Auto unboxing
	}

}
