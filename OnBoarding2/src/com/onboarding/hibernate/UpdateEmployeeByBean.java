package com.onboarding.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class UpdateEmployeeByBean {
	
	public static void main(String [] agrs) {
		
		//creating the configuration
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		
		//Opening the session
		Session ss = sf.openSession();
		//Begining the Transaction 
		Transaction tx = ss.beginTransaction();
		
		int searchID = 4;
		String newValue = "New Jersy";
		
		Employee emp = (Employee) ss.get(Employee.class, searchID);
		//emp.setEadd(newValue);
		ss.update(emp);
		
		tx.commit();
		ss.close();
		
		
		
	}

}
