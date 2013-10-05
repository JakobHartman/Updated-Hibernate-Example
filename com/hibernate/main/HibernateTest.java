package com.hibernate.main;

import com.larson.matt.HibernateUtilSingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.test.address;
import com.hibernate.test.phone_number;

public class HibernateTest {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		phone_number phone = new phone_number();
		phone.setUserId(1);
		phone.setUserName("Matthew");
		phone.setPssword("mattPassword");
		phone.setPhoneNumber(1234567890);
		
		phone_number phone2 = new phone_number();
		phone2.setUserId(2);
		phone2.setUserName("Mallory");
		phone2.setPssword("malloPassword");
		phone2.setPhoneNumber(2087609459);
		
		phone_number phone3 = new phone_number();
		phone3.setUserId(3);
		phone3.setUserName("Mortimer");
		phone3.setPssword("mortPassword"); 
		phone3.setPhoneNumber(2083152014);
		
		address address1 = new address();
		address1.setId(1);
		address1.setStreet_num(14030);
		address1.setStreet("Riverside Dr.");
		address1.setCity("Apple Valley");
		
		
		// sessionFactory is deprecated in hibernate 4
		
		SessionFactory sessionFactory = HibernateUtilSingleton.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(phone);
		session.save(phone2);
		session.save(phone3);
		session.save(address1);
		session.getTransaction().commit();
		
		// This is how you would start a new transaction if you wanted to merge new information.
		
		/*phone.setUserName("Matty");
		session.beginTransaction();
		session.merge(phone);
		session.getTransaction().commit();*/
		

	}

}