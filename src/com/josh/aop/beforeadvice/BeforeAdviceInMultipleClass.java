package com.josh.aop.beforeadvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.josh.aop.beforeadvice.dao.AccountDAO;
import com.josh.aop.beforeadvice.dao.MembershipDAO;

public class BeforeAdviceInMultipleClass {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		com.josh.aop.beforeadvice.dao.AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		com.josh.aop.beforeadvice.dao.MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
				
		// call the business method
		theAccountDAO.addAccount();

		// call the membership business method
		theMembershipDAO.addSillyMember();
						
		// close the context
		context.close();
	}

}










