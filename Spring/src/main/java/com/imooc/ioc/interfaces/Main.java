package com.imooc.ioc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ca=new ClassPathXmlApplicationContext("spring-ioc.xml");
		OneInterfaceImpl oti= (OneInterfaceImpl) ca.getBean("oneInterface");
		oti.say("20180521");
		//Car car1=(Car) ca.getBean("Car");
				//System.out.println(car1);
		Car car2=(Car) ca.getBean("Car");
				System.out.println(car2);
				Person person1=(Person) ca.getBean("Person");
				System.out.println(person1);
	}
		
}
