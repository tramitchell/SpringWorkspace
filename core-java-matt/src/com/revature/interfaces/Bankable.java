package com.revature.interfaces;

public interface Bankable {
	static double interest(double principal, int rate) {
		return principal * (1 + rate / 100.0d);
	}
	
	void deposit(int amt);
}
