package com.accounts;

import java.time.LocalDate;

import com.account.Exception.AccountAlreadyActive;
import com.account.Exception.AccountalreadyClosed;
import com.account.Exception.AgeValidityException;

public class SavingAccount extends Account {
	private LocalDate dateofbirth ;
	private  String gender;
	private String phoneNumber;
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean open() throws AccountAlreadyActive , AgeValidityException {
		if(this.isActive())
			throw new AccountAlreadyActive("Account is already Active");
		
		
		boolean isOpened = false;
		boolean isValid = false;
		try {
			isValid = checkAgevalidity(getDateofbirth());
			isOpened = activeAccount(isValid);
		}
		catch(AgeValidityException e)
		{
			System.out.println("Age is less than 18 years");
		}
		return isOpened;
		}
	
	public boolean activeAccount(boolean isValid) {
		boolean isActivated = false;
		if(isValid) {
			this.setActive(isValid);
			this.setActivateDate (LocalDate.now());
			isActivated = true;
			
		}
		return isActivated;
		}
	
	public boolean checkAgevalidity(LocalDate dateofBirth) throws AgeValidityException {
	boolean isValid = false;
	if(LocalDate.now().getYear()- dateofBirth.getYear()<18)
		throw new AgeValidityException("Age is less than 18 years");
	isValid = true;
	return isValid;
	}
	
	
	
	

	
}
