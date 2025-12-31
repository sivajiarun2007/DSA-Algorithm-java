package com.dsa.algorithm.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlatMapAndDoubleSorting {

	public static void main(String[] args) {
		List<List<String>> str = List.of(List.of("Arun", "Sve"), List.of("Sia"), List.of("Someone"));

		var res1 = str.stream().flatMap(x -> x.stream()).toList();
		System.out.println(res1);

		List<Person> sortPers = new ArrayList<>();
		sortPers.addAll(Person.PERSON_LIST);

		System.out.println(Person.PERSON_LIST);

		sortPers.stream().sorted(Comparator.<Person,Integer>comparing(pers -> pers.salary).thenComparing(pers -> pers.name))
				.toList();

		List<Person> sortedList = Person.PERSON_LIST.stream().sorted(Comparator.comparing(Person::getSalary) // First: age
																											// ASC
				.thenComparing(Person::getName, Comparator.reverseOrder())) // Then: salary DESC
				.toList();

		sortedList.forEach(System.out::println);

	}

}
