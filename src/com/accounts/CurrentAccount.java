package com.accounts;

import com.account.Exception.AccountAlreadyActive;
import com.account.Exception.AgeValidityException;

public class CurrentAccount extends Account {

	private String Name;
	private String registrationnumber;
	private String companyname;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRegistrationnumber() {
		return registrationnumber;
	}
	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	@Override
	public boolean open() throws Exception  {
		if(this.isActive())
			throw new Exception("Account is already Active");
		boolean isOpened = true;
		boolean isValid = false;
			try {
				  isValid = checkregistration(getRegistrationnumber());
				  isOpened = activeAccount(isValid);
						  
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
		return isOpened;
		
	}

	private boolean activeAccount(boolean isValid) throws AccountAlreadyActive {
		// TODO Auto-generated method stub
		isValid = false;
		if(this.isActive())
			throw new AccountAlreadyActive("Account is already opened");
		isValid = true;
		return isValid;
	}
	private boolean checkregistration(String registrationnumber2) {
		boolean isValid = false;
		if(registrationnumber == null)
		throw new NullPointerException("Registration number is null");
		isValid = true;	
		
		// TODO Auto-generated method stub
		return isValid;
	}
{
		// TODO Auto-generated method stub
			

	
}

}
