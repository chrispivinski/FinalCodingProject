package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
 
	
	 
	public RateDomainModel mod1;
	
	public RateException(RateDomainModel rateDomainModel) {
		this.mod1 = rateDomainModel;
		System.out.println("Your credit score is too low to be approved for a loan");
	}
	
	public RateDomainModel getrateDomain() {
		return mod1;
	}
	
}
