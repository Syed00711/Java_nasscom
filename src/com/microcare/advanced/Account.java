package com.microcare.advanced;

public class Account {
	private long number;
	public long getMinBalance() {
		return minBalance;
	}

	private String name;
	private long minBalance=5000;
	private long balance;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		if(checkminBalance(balance)) {
		this.balance = balance;
		}
	}
	 private  boolean checkminBalance(long balance){
		return minBalance<(balance)?true:false;
	}
	}
	


