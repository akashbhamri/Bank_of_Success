package com.accounts;

import java.util.HashMap;
import java.util.Map;

import com.account.Exception.InvalidPrivileageException;



public class Accountprivillidge {

	private static Map<Privileage , Double> privileges = new HashMap<Privileage, Double>();
 	static {
 		privileges.put(Privileage.PREMIUM, (double) 1000000);
 		privileges.put(Privileage.GOLD, (double) 50000);
 		privileges.put(Privileage.SILVER, (double) 5000);
 	}
 	
 	public static double getPrivilege(Privileage privilege, Object privileage) throws InvalidPrivileageException
 	{double limit = 0.0;
 	
		if(privileges.containsKey(privileage))
		limit = privileges.get(privileage);
			
		
		else 
			throw new InvalidPrivileageException("Invalid Privilege");
		return limit; 
	
 		
		
}
}
