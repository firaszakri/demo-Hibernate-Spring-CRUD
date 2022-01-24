package com.firas.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.firas.hibernate.test.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory(); 
		
	}

}
