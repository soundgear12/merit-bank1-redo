package com.meritamerica.assignment1;

public class CheckingAccount {
	private double balance;
	private double interestRate = .0001;
	int years;
	double futureValue = 1;
	
	CheckingAccount (double openingBalance) {
		balance = openingBalance; 
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
			balance += amount;
			return true;
		} else {
			return false;
		}
	}
	
	double futureValue(int years) {
		
		double futureValue = (balance * Math.pow(1 + interestRate, years));
		double roundedValue = Math.round(futureValue * 100.0) / 100.0;
		return roundedValue;
	}
	@Override
	public String toString() {
		return "Checking Account Balance=" + balance + "\n" +
								"Checking Account Interest Rate=" + interestRate + "\n" +
								"Checking Account Balance in 3 years" + futureValue(3);
	}
	
}