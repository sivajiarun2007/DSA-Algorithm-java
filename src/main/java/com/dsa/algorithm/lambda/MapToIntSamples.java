package com.dsa.algorithm.lambda;

import java.util.List;

public class MapToIntSamples {

	public static void main(String[] args) {
		List<Person> list = List.of(new Person("Arun", 30, 1000), new Person("Arun 1", 30, 1000),
				new Person("Arun", 20, 1000), new Person("Arun", 10, 1000), new Person("Arun", 20, 1000));
		
		System.out.println(list.stream().count());
		System.out.println(list.stream().mapToInt(x-> x.age).max().getAsInt());
		System.out.println(list.stream().mapToInt(x-> x.age).sum());
	}

}
