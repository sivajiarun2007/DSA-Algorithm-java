package com.dsa.algorithm.lambda;

import java.util.List;

class Person {

	public static final List<Person> PERSON_LIST = List.of(new Person("Arun", 30, 1500), new Person("Arun 1", 30, 2400),
			new Person("Drun", 20, 1000), new Person("Brun", 10, 2000), new Person("Rrun", 20, 1000));

	public Person(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	String name;
	Integer age;
	Integer salary;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}