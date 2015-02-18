package com.onboarding.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DeleteEmployeeByBean {
	
	public static void main(String [] args){
		
		//Creating the configuration
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		
		//Opening the session
		Session ss = sf.openSession();
		//Start transaction
		Transaction tx = ss.beginTransaction();
		
		int searchID = 0;
		Employee emp = (Employee)ss.get(Employee.class, searchID);
		ss.delete(emp);
		
		//commit transaction
		tx.commit();
		//close the session
		ss.close();
		
	}
	
	
}
