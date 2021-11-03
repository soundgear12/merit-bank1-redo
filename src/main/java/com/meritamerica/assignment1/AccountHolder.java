package com.meritamerica.assignment1;

public class AccountHolder extends Object {
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	CheckingAccount checkingAccount;
	SavingsAccount savingsAccount;
	
	AccountHolder() {
		
	}
	
	
	public AccountHolder(double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance); 
	}


	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	@Override
	public String toString() {
		return "AccountHolder [Name=" + firstName + middleName + lastName + "\n" +
				", ssn=" + ssn + "\n" +
				" Checking Account Balance: $" + getCheckingAccount().getBalance() + "\n" +
				" Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() + "\n" +
				" Checking Account Balance in 3 years: $" + getCheckingAccount().futureValue(3) + "\n" +
				" Savings Account Balance: $" + getSavingsAccount().getBalance() + "\n" +
				" Savings Account Interest Rate: " + getSavingsAccount().getInterestRate() + "\n" +
				" Savings Account Balance in 3 years: $" + getSavingsAccount().futureValue(3) ;
				
	}
	

}	
	
