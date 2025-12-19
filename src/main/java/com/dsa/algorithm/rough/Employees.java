package com.dsa.algorithm.rough;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee1 {
	
	
	@Override
	public String toString() {
		return "Employee1 [department=" + department + ", date=" + date + ", salary=" + salary + ", name=" + name + "]";
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee1(String department, Date date, Long salary, String name) {
		super();
		this.department = department;
		this.date = date;
		this.salary = salary;
		this.name = name;
	}
	
	String department;
	Date date;
	Long salary;
	String name;
	
	
}

public class Employees {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("IT", new Date(), 50_000L, "Arun");
		Employee1 emp3 = new Employee1("Admin", new Date(), 20_000L, "Sve1");
		Employee1 emp2 = new Employee1("IT", new Date(), 30_000L, "Sia");
		Employee1 emp4 = new Employee1("IT", new Date(), 10_000L, "Sve");
		
		List<Employee1> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
//		emp.stream().sorted((a,b)-> {
//			Comparator.comparing(a.name)
//		});
		
//		emp.sort(Comparator.comparing(Employee1::getDepartment)
//				.thenComparing(Employee1::getDate)
//				.thenComparing(Employee1::getSalary));
//		emp.forEach(x -> {
//			System.out.println(x);
//		});
		
		Map<String, List<Employee1>> result = emp.stream().collect(Collectors.groupingBy(x-> {
			return  x.getDepartment().toString() + x.getSalary().toString();
		}, TreeMap::new, Collectors.toList() ));
		
		
		
		result.entrySet().stream().forEach(x -> {
			System.out.println(x);
		});
		
		 
		
		
	}

}
