package com.udemy.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public String addAnyMethod() {
		
		System.out.println(getClass() + " : DOING STUFF: ADDING A MEMBERSHIP ACCOUNT ");
		return "hello";
	}

}
