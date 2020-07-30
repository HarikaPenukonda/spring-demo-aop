package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related  advices for logging
	
	// let's start with @Before advice
	
	@Before("execution(public void com.udemy.aopdemo.dao.AccountDAO.addAccount())")
	//@Before("execution(public void updateAccount())")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n===> Executiong @Before advice on method ");
	}

}