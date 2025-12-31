package com.dsa.algorithm.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingBySample {

	public static void main(String[] args) {

		List<Person> list = List.of(new Person("Arun", 30, 1000), new Person("Arun 1", 30, 1000),
				new Person("Arun", 20, 1000), new Person("Arun", 10, 1000), new Person("Arun", 20, 1000));
		
		System.out.println(list.stream().count());
		System.out.println(list.stream().mapToInt(x-> x.age).max().getAsInt());
		var result = list.stream().collect(Collectors.groupingBy(x -> x.age));
		System.out.println(result);

	}

}
