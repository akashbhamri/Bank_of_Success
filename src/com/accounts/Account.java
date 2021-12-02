package com.accounts;

import java.time.LocalDate;

import com.account.Exception.AccountAlreadyActive;
import com.account.Exception.AccountalreadyClosed;
import com.account.Exception.AgeValidityException;
import com.account.Exception.InsufficientBalance;
import com.account.Exception.WrongpinNumber;

public  abstract class Account {
	private int accountNumber;
	private String name;
	private int pinnumber;
	private Privileage privilege;
	private double balance;
	private boolean isActive;
	private LocalDate activateDate;
	private LocalDate closedDate;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}
	public Privileage getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privileage privilege) {
		this.privilege = privilege;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDate getActivateDate() {
		return activateDate;
	}
	public void setActivateDate(LocalDate activateDate) {
		this.activateDate = activateDate;
	}
	public LocalDate getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}
	public abstract boolean open() throws AccountAlreadyActive, AgeValidityException, Exception;


	public boolean withdraw(double amount , int pinnumber) throws AccountalreadyClosed, WrongpinNumber, InsufficientBalance {
	boolean isWithdrawn = false;
	if(!this.isActive())
		throw new AccountalreadyClosed("account is closed");
	if(this.getPinnumber()!= pinnumber)
		throw new WrongpinNumber("pin number is wrong Try Again");
	if(this.getBalance()<amount)
		
		throw new InsufficientBalance("insufficient balance");
	    double balance = this.getBalance();
	    this.setBalance(balance - amount);
		isWithdrawn = true;
		
		return isWithdrawn;
	}
	
	public boolean deposit(double amount) throws AccountalreadyClosed {
	boolean isDeposit = false;
	if(!this.isActive)
		throw new AccountalreadyClosed("Account is closed");
    double balance = this.getBalance();
    this.setBalance(balance+amount);
    isDeposit = true;
    return isDeposit;
	}
	
	
	
	//Transaction
	
	
		public boolean transfer1(Transfer transfer1) throws AccountalreadyClosed {
			boolean isTransferred = false;
			if(!transfer1.getFromAccount().isActive())
				throw new AccountalreadyClosed("Senders account is closed");
			if(!transfer1.getToAccount().isActive())
				throw new AccountalreadyClosed("Receiver Account is closed");
			
			isTransferred = true;
			
			
			return isTransferred;
			
			}
		
	
	
	public  boolean closeAccount() throws AccountalreadyClosed

{
		boolean isClosed = false;
		if(!this.isActive)
		
			throw new AccountalreadyClosed("account is closed");
		this.setActive(false);
		this.setClosedDate(LocalDate.now());
		isClosed = true;
		return isClosed;		
}
	}
	

