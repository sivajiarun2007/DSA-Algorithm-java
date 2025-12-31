package com.dsa.algorithm.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String name;
	String dept;
	int salary;

}

public class GroupBySalary {

	public static void main(String[] args) {

		Employee e1 = new Employee("A", "Comp", 1000);
		Employee e2 = new Employee("A", "Mech", 1000);
		Employee e3 = new Employee("A", "Mech", 1000);
		Employee e4 = new Employee("A", "Sport", 1000);
		Employee e5 = new Employee("A", "Comp", 1000);

		List<Employee> empList = List.of(e1, e2, e3, e4, e5);
		Map<String, Integer> res = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.dept, Collectors.summingInt(x -> x.salary)));
		Map<String, Integer> deptMaxSalary = empList.stream()
			    .collect(Collectors.groupingBy(
			        emp-> emp.dept, Collectors.reducing(0, emp -> emp.salary, Math::max) //same can be used for sum as well
			    ));
		System.out.println(res);
		System.out.println(deptMaxSalary);
		
		

	}

}
