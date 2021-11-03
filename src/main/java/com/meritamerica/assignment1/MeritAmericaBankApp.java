package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder Jerry = new AccountHolder("Jerry", "Fucking", "Seinfeld", "123456789", 100.00, 1000.00);
		System.out.println(Jerry.toString());
	}
}