package com.bonaet.HibOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App // POJO
{
	public static void main(String[] args) {
		User u = new User();
		u.setFname("Bonface");
		u.setLname("Muoki");

		Configuration conn = new Configuration().addAnnotatedClass(User.class);
    	conn.configure("hibernate.cfg.xml");
		SessionFactory sf = conn.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		try {
			
			s.save(u);
			tx.commit();
			
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}

	}
}
