package com.accounts;

public class Transfer {

	private Account fromAccount;
	private Account toAccount;
	private double amount;
	private TranferMode tranferMode;
	private int pinNumber;
	
	//constructor with field
	public Transfer(Account fromAccount, Account toAccount, double amount, TranferMode tranferMode, int pinNumber) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.tranferMode = tranferMode;
		this.pinNumber = pinNumber;
	}
	
	public Account getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Account getToAccount() {
		return toAccount;
	}
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TranferMode getTranferMode() {
		return tranferMode;
	}
	public void setTranferMode(TranferMode tranferMode) {
		this.tranferMode = tranferMode;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
}
