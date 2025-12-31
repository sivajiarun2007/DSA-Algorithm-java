package com.dsa.algorithm.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateSample {

	public static void main(String[] args) {
		List<String> orgList = List.of("Arun",
				"Arun",
				"Sia",
				"Sia",
				"Sve"
				);
		
		Set<String> set = new HashSet<>();
		
		System.out.println(orgList.stream().filter(x -> !set.add(x)).toList());
		
		System.out.println(orgList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
	}

}
