package com.revature.pojo;

public class User {
	private int bankId;
	private String username;
	private String password;
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	} 
	
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "Username = " + username + ", password = " + password;
	}

}
