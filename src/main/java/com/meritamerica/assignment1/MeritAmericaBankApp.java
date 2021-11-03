package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder Jerry = new AccountHolder("Jerry", "Fucking", "Seinfeld", "123456789", 100.0, 1000.0);
		Jerry.getCheckingAccount().deposit(500);
		Jerry.getSavingsAccount().withdraw(800.0);
		AccountHolder Michael = new AccountHolder("Michael", "J", "Fox", "987654321", 200.00, 500.00);
		Michael.getCheckingAccount().deposit(-500);
		Michael.getSavingsAccount().withdraw(600);
		System.out.println(Jerry.toString());
		System.out.println(Michael.toString());
	}
}