package com.firas.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.firas.hibernate.test.entity.Employee;




public class CreateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
	
		try {
			
			Employee emp1= new Employee("Mark","Hamil","DAX");
			Employee emp2= new Employee("Janet","Smith","Bayer");
			Employee emp3= new Employee("Ahmad","Saif","BIOTECH");
			
			session.beginTransaction();
			
			System.out.println("saving the students");
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
		
			
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}
}
