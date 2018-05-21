package com.imooc.ioc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ca=new ClassPathXmlApplicationContext("spring-ioc.xml");
		OneInterfaceImpl oti= (OneInterfaceImpl) ca.getBean("oneInterface");
		oti.say("20180521");
	}

}
