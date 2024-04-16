package abstraction;

import java.util.Scanner;

public class Main_choco {
	
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	Chocolatecal c1=new Chocolatecal();
	System.out.println("Enter amount to buy chocolates....");
	int num=s1.nextInt();
	Chocolate u1=c1.gen_amount(num);
	u1.chocoki();
	u1.lollipop(); 

//	System.out.println("---------");
//	Chocolate u2=c1.gen_amount(5);
//	u2.chocoki();
//	u2.lollipop();
}
}
