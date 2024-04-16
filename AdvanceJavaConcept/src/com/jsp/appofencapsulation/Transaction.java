package com.jsp.appofencapsulation;

public class Transaction {
public static void deposit(double amt,Account ref) {
	double balan=ref.getBal();
	balan =balan+amt;
	ref.setbal(balan);	
}
public static void withdraw(double amt,Account ref) {
	double balanc= ref.getBal();
	balanc =balanc-amt;
	ref.setbal(balanc);	
}
public static void Checkbal(Account ref) {
	double balance1 = ref.getBal();
	System.out.println("The current bal is:"+balance1);
}
}
