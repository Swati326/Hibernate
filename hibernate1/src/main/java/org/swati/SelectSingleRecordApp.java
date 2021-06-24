package org.swati;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectSingleRecordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();		
		Object obj=session.get(Employee.class,new Integer(3));
		if(obj!=null)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName());
		}
		else
		{
		System.out.println("Not found");
	}
	}
}
