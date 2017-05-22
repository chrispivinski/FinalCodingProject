package rocketBase;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.*;
import org.hibernate.Session;

import exceptions.RateException;
import rocketDomain.RateDomainModel;
import util.HibernateUtil;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM RateDomainModel r ORDER BY r.getiMinCreditScore ASC";
		List lstRates = session.createQuery(hql).list();
		
		for(RateDomainModel rate : rates) {
			if (rate.getiMinCreditScore() <= GivenCreditScore)
			{
				dInterestRate = rate.getdInterestRate();
			}
		}
		if (dInterestRate == 0) {
			RateDomainModel rateDomain = new RateDomainModel();
			rateDomain.setiMinCreditScore(GivenCreditScore);
			throw new RateException(rateDomain);
			
		}
		
		return dInterestRate;
		
	}
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
