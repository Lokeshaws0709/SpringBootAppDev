package com.tcs.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/tcs/model/config.xml");
		
		Employee emp=(Employee)context.getBean("emp");
//		  emp.setEmpId(102);
//		  emp.setEmpNm("Geetha"); 
//		  emp.setSal(300.30); 
//		  Address addr=new Address(); 
//		  addr.setCity("hyd"); 
//		  addr.setHno("20/20");
//		  emp.setAddr(addr);
		 
		System.out.println(emp);
		
		System.out.println("Welcome to GitHub With test_br branch");

	}

}
