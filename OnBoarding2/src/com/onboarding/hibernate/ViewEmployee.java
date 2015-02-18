package com.onboarding.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ViewEmployee {

	public static void main(String[] args) {

		//Creating configuration
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		//To select all the records
		//String query = "from Employee as e";
		//List <Employee>listOfResult = ss.createQuery(query).list();
		
		//Retrieve based on criteria
		int searchID = 2;
		String query = "from Employee as e where e.id = :key";
		@SuppressWarnings("unchecked")
		List <Employee> listOfResult = ss.createQuery(query).setInteger("key", searchID).list();
		
		Iterator <Employee> iterator = listOfResult.iterator();
		
		while(iterator.hasNext()) {
			
			Employee emp = iterator.next();
			/*System.out.println("EMPLOYEE ID : "+ emp.getId() +
							   "   NAME : " +	emp.getEname() +
							   "   JOB : " + emp.getEjob() +
							   "   ADDRESS : " + emp.getEadd() +
							   "\n");
			*/
		}
		
		tx.commit();
		ss.close();
	}

}
