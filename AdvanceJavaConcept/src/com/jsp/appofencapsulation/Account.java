package com.jsp.appofencapsulation;

public class Account {
	private String AhName;
	private double bal;

	public void setbal(double bal) {
		if (bal > 0) {
			this.bal = bal;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double getBal() {
		return bal;
	}

	public String getName() {
		return AhName;
	}

	public void setName(String name) {
		this.AhName = name;
	}
}
