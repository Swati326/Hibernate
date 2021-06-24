package org.swati;



import java.util.*;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter id of Employee which you want delete");
int id=sc.nextInt();
		System.out.println("Enter name of Employee which you want delete");
		sc.nextLine();
		String name=sc.nextLine();
		Employee emp=new Employee();
        emp.setId(id);
		emp.setName(name);
		session.delete(emp);
		t.commit();
		session.close();
		System.out.println("Delete successfully..............");
	}

}
