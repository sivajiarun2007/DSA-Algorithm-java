package com.dsa.algorithm.rough;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public Employee(String name, Long id) {
		this.id = id;
		this.name = name;
	}
	String name;
	Long id;
}

public class StreamGroupBySample {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Arun", 1L);
		Employee emp2 = new Employee("Sve", 2L);
		Employee emp3 = new Employee("Sia", 3L);
		Employee emp4 = new Employee("Sia", 4L);
		List<Employee> emp = List.of(emp1,emp2, emp3,emp4);
		
		Map<String, List<Employee>> result = emp.stream().collect(Collectors.groupingBy(x -> x.name));
		System.out.println(result);
		
	}

}
