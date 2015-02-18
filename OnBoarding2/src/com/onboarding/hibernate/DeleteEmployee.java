package com.onboarding.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		//Creating configuration
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		//Deletion based on criteria
//		int searchID = 4;
//		String query = "delete from Employee as e where e.id = :key";
//		ss.createQuery(query).setInteger("key", searchID).executeUpdate();

		//Delete all the records
		String query = "delete from Employee as e";
		ss.createQuery(query).executeUpdate();
		tx.commit();
		ss.close();
	}

}
