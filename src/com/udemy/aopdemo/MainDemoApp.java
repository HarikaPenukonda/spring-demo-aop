package com.udemy.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.aopdemo.dao.AccountDAO;
import com.udemy.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = 
				context.getBean("accountDAO", AccountDAO.class);
		
		// GET MEMBERSHIP BEAN FROM SPRING CONTAINER
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO",MembershipDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();
		
		// call the membership method
		theMembershipDAO.addAnyMethod();
		
		// close the context
		context.close();
	}

}
