package com.jsp.appofencapsulation;

import java.util.Scanner;

public class Mainuti {
	Scanner s2 = new Scanner(System.in);
	Account a1 = new Account();
	
	public void Deposite() {
		System.out.println("Enter  amount to deposit");
		
		double depositAmount = s2.nextDouble();
		Transaction.deposit(depositAmount, a1);
		System.out.println("Amount deposited sucessfully");
		Transaction.Checkbal(a1);
		
	}
	public void Withdraw() {
		System.out.println("Enter the amount to withdraw");
		double withdrawAmount = s2.nextDouble();
		Transaction.withdraw(withdrawAmount, a1);
		System.out.println("Amount Withdrawn Sucessfully");
		
	}
	public void Checkbalance() {
		Transaction.Checkbal(a1);
	}

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to MyBank...");
		System.out.println("\nClick :1 To Deposite money\n\t Click :2 To Withdraw money\n\t\tClick :3 To Check balance\n\t");
		Scanner sca=new Scanner(System.in);
		Mainuti m=new Mainuti();
		
		int Input=sca.nextInt();
		switch(Input) {
		case 1 ->m.Deposite();
		
		case 2 ->m.Withdraw();
		case 3 ->m.Checkbalance();
		default-> System.out.println("Invalid option clicked");
		
		}
		System.out.println("\n\tSession Completed Visit Again");
		
	}
}