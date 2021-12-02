package com.accounts1;

import java.rmi.AccessException;
import java.time.LocalDate;

import com.Accounts.exxeptions.AccountAlreadyClosedException;
import com.Accounts.exxeptions.InsufficientAccountBalanceException;
import com.Accounts.exxeptions.LimitExceedsExceptions;
import com.Accounts.exxeptions.PinNumberException;
import com.account.Exception.AccountAlreadyActive;
import com.account.Exception.AccountalreadyClosed;
import com.account.Exception.AgeValidityException;
import com.accounts.Account;
import com.accounts.CurrentAccount;
import com.accounts.Privileage;
import com.accounts.SavingAccount;
import com.accounts.TranferMode;
import com.accounts.Transfer;

public class Test  {


public static void main(String[] args) throws Exception {
	
	System.out.println("--------------Bank of success----------");
	SavingAccount name1 = new SavingAccount();
 name1.setName("Akash");
	name1.setGender("Male");
	name1.setAccountNumber(1234);
	LocalDate dateofBirth = LocalDate.of(1998, 11, 26);
	name1.setDateofbirth(dateofBirth);
	name1.setBalance(500000);
	name1.setPinnumber(1234);
	boolean isOpened = false;
	try {
		isOpened = name1.open();
		
	}catch(AccountAlreadyActive | AgeValidityException s){
		s.printStackTrace();
		
	}if(isOpened)
		System.out.println("Saving Account is Opened");

	CurrentAccount ca = new CurrentAccount();
	ca.setName("akash");
	ca.setCompanyname("capgemini");
	ca.setRegistrationnumber("12345");
	
	boolean isOpeneds = false;
	try {
		isOpeneds = ca.open();
	}
	catch(AccountAlreadyActive | AgeValidityException s)
	{
		s.printStackTrace();
	}
	if(isOpeneds)
	{
		System.out.println("Current Account is Opened");
	}
	
	
	boolean withdraw = false;
	try {
		withdraw = name1.withdraw(50000, 1234);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	if(withdraw)
		System.out.println("Amount is deducted Successfully!!!!!");
	
	
	
	boolean Deposit = false;
	try {
		Deposit = name1.deposit(50000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	if(Deposit)
		System.out.println("Account is deposit Successfully!!!!!!");
	
	
	
	

	
	
	//Check that account is open or not
	
	boolean isOpened1 = false;
	try {
		
		isOpened1 = name1.open();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	if(isOpened1)
		name1.setBalance(100000);
	    name1.setPinnumber(1234);
	    name1.setPrivilege(Privileage.PREMIUM);
	    
	boolean isOpened2 = false;
	try {
		isOpened2 = ca.open();
	}
	catch(AccountalreadyClosed | AgeValidityException e)
	{
		e.printStackTrace();
	}
	if(isOpened2)
		ca.setBalance(50000);
	     ca.setPinnumber(2222);
	     ca.setPrivilege(Privileage.PREMIUM);
	////////////////////////////////////////////////////////////
	
	 	
	     Transfer transfer = new Transfer(name1 , ca , 500,TranferMode.IMPS,1234);
	     	name1.transfer1(transfer);
	     	
	     	System.out.println("Transaction : 1");
			try {
				boolean transferFund = account1.transferFund(funds);
				if(transferFund)
					System.out.println(" Transfered Successfully");
					System.out.println(account1.getBalance());
					System.out.println(account2.getBalance());
			} catch (AccountAlreadyClosedException | LimitExceedsExceptions | PinNumberException |InsufficientAccountBalanceException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
}
}

