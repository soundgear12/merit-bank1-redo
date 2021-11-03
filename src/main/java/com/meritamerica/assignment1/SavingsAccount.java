package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double balance;
	private double interestRate = .01;
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
	
	public Boolean withdraw (double amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean deposit (double amount) {
		if (amount > 0) {
			balance =+ amount;
			return true;
		} else {
			return false;
		}
		
	}
	
	public double futureValue(int years) {
		
		double futureValue = (balance * Math.pow(1.0 + interestRate, years));
		double roundedValue = Math.round(futureValue * 100.0) / 100.0;
		return roundedValue;
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", Savings Account Balance in 3 years )="
				+ futureValue(3) + "]";
	}
	
	
	
}