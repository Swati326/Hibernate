package org.swati;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of Employee for edit");
		int id=sc.nextInt();
		System.out.println("update name of Employee for this id");
		sc.nextLine();
		String name=sc.nextLine();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		session.update(emp);
		t.commit();
		session.close();
		System.out.println("successfully updated..............");

	}

}
