package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class rate_test {

	public void test(){
		RateDomainModel m1 = new RateDomainModel();
		m1.setdInterestRate(7);
		m1.setiMinCreditScore(625);
		m1.setiRateID(1);
		
		assertTrue(m1.getdInterestRate() ==7);
	}
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

} 