package com.hibernate.main;

import com.larson.matt.HibernateUtilSingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.test.phone_number;

public class HibernateTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		phone_number phone = new phone_number();
		phone.setUserId(1);
		phone.setUserName("Matthew");
		phone.setPssword("mattPassword");
		phone.setPhoneNumber(1234567890);
		
		phone.setUserId(2);
		phone.setUserName("Mallory");
		phone.setPssword("malloPassword");
		phone.setPhoneNumber(2087609459);
		
		phone.setUserId(3);
		phone.setUserName("Mortimer");
		phone.setPssword("mortPassword"); 
		phone.setPhoneNumber(2083152014);
		
		// sessionFactory is deprecated in hibernate 4
		
		SessionFactory sessionFactory = HibernateUtilSingleton.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(phone);
		session.getTransaction().commit();
		

	}

}