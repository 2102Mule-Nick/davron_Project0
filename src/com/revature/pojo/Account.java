package com.revature.pojo;


public class Account {
	
	private long accountNumber;
	private String type;
	private double balance;
	
	public Account() {
		super();
	}
	
	public Account(long accountNumber, String type, double balance) {
		this();
		this.setAccountNumber(accountNumber);
		this.setType(type);
		this.setBalance(balance);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
