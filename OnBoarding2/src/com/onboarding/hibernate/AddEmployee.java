package com.onboarding.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class AddEmployee {
	
	public static void main(String [] arg) {
		
		Configuration config = new Configuration();
		config.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();		
		SessionFactory sf = config.buildSessionFactory(sr);
		
		Employee emp1 = new Employee("1","ujjal.b","Ujjal","Bhattacharjee", "05/30/1978", "ujjal.b@gmail.com", "password");
		Employee emp2 = new Employee("2","seema.b","Seema","Bhattacharjee", "02/03/1978", "seema.b@gmail.com", "password");
		Employee emp3 = new Employee("3","reyan.b","Reyan","Bhattacharjee", "10/14/2007", "reyan.b@gmail.com", "password");
		Employee emp4 = new Employee("4","raima.b","Raima","Bhattacharjee", "09/08/2010", "raima.b@gmail.com", "password");
		

		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		ss.save(emp1);
		ss.save(emp2);
		ss.save(emp3);
		ss.save(emp4);
		
		tx.commit();
		
		ss.close();
	}

}
