package com.hibernate.main;

import com.larson.matt.HibernateUtilSingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.test.phone_number;

public class HibernateMerge {

	public static void main(String[] args) {
		
		phone_number phone = new phone_number();
		phone.setUserId(1);
		phone.setUserName("Matthew");
		phone.setPssword("mattPassword");
		phone.setPhoneNumber(1234567890);
		
		SessionFactory sessionFactory = HibernateUtilSingleton.getSessionFactory();
		Session session = sessionFactory.openSession();
		phone.setUserName("Matty");
		session.beginTransaction();
		session.merge(phone);
		session.getTransaction().commit();
	}
}