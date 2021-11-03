package com.meritamerica.assignment1;

public class SavingsAccount {
	
	static double balance;
	static double interestRate = .01;
	int years;
	double futureValue = 1;
	
	public SavingsAccount(double openingBalance) {
		balance += openingBalance;
	}
	double getBalance() {
		return balance;
	}
	double getInterestRate() {
		return interestRate;
	}
	
	
	
	public double getFutureValue() {
		return futureValue;
	}
	
	boolean withdraw (double amount) {
		if (amount < balance) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean deposit (double amount) {
		if (amount > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	static double futureValue(int years) {
		
		double futureValue = (balance * Math.pow(1.0 + interestRate, years));
		return futureValue;
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", Savings Account Balance in 3 years )="
				+ futureValue(3) + "]";
	}
	
	
	
}