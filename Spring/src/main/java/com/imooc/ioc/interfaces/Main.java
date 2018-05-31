package com.imooc.ioc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ca=new ClassPathXmlApplicationContext("spring-ioc.xml");
		//Car a=(Car) ca.getBean("Car1");
		Person a=(Person) ca.getBean("Person");
		System.out.println(a);
	}
		
}
