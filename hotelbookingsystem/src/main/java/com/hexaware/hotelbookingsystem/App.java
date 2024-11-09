package com.hexaware.hotelbookingsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
				System.out.println(session);
				
				
				//Transaction tr = session.beginTransaction();
    }
}
