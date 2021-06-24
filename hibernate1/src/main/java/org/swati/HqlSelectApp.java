package org.swati;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class HqlSelectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		org.hibernate.Query q=session.createQuery("from Employee emp");
		List l=((org.hibernate.Query) q).list();
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			Employee e=(Employee)obj;
		
		System.out.println(e.getId()+"\t"+e.getName());
	}

}
}
