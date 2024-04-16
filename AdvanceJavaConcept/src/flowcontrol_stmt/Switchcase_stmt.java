package flowcontrol_stmt;

import java.util.Scanner;

public class Switchcase_stmt {

//	public static void select(char option) {
//		switch (option)
//		{
//		case'a':System.out.println("Option a is selected!");
//		break;
//		case 'b':System.out.println("Option b is selected!");
//		break;
//		case 'c':System.out.println("Option c is selected!");
//		break;
//		case 'd':System.out.println("Option d is selected!");
//		}
//	}
	public static void main(String[] args) {
//		select('a');
//		select('b');
//		select('c');
//		select('d');
//		select('e');  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values to check ur luck");
		//Advance version of java of switch
		var option=sc.nextInt();
		switch(option){
		
		case 1,2->System.out.println("junith");
		case 3-> System.out.println("mohammed");
		default ->System.out.println("Mohammed junaith");
		}
	}
}
