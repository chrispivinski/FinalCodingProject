package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {
	
	public void test(){
		RateDomainModel m1 = new RateDomainModel();
		m1.setdInterestRate(7);
		m1.setiMinCreditScore(625);
		m1.setiRateID(1);
		
		assertTrue(m1.getdInterestRate() ==7);
	} 
	
	@Test
	public void testCreditScore()
	{	
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		assertEquals (5, rates.size()); 
		
	}



}
