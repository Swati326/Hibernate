package org.swati;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConfigApp {

	public static void main(String[] args) throws HibernateException{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory sf=(cfg).buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter id of Employee");
		//int id=sc.nextInt();
		System.out.println("Enter name of Employee");
		String name=sc.nextLine();
		Employee emp=new Employee();
		//emp.setId(id);
		emp.setName(name);
		session.save(emp);
		t.commit();
		session.close();
		System.out.println("successfuly inserted..............");

	}

}
