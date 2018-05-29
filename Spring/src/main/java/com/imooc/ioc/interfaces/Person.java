package com.imooc.ioc.interfaces;
import java.util.*;
public class Person {
	private String name;
	private int age;
	private List<Car> car;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	
	public Person(String name, int age, List<Car> car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	public Person() {}
}
