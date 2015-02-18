package com.onboarding.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		//Creating Configuration
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		
		int searchID = 2;
		String newValue = "New Jersy";
		String query = "update Employee as e set e.eadd = :newAddress where e.id = :key";
		
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		ss.createQuery(query).setString("newAddress", newValue).setInteger("key", searchID).executeUpdate();
		
		tx.commit();
		ss.close();
 
	}

}
