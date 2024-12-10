package com.dsa.algorithm.rough;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamUtils {

	public static void main(String[] args) {
		List<List<String>> result = List.of(List.of("Arun", "Ganhdi"), List.of("Sve", "Sri"), List.of("Sve","Sia"));
		
		var  finalResult = result.stream().flatMap(x -> x.stream()).toList();
		var  finalSet = result.stream().flatMap(x -> x.stream()).collect(Collectors.toSet());
		var  finalCounterMap = result.stream().flatMap(x -> x.stream()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(finalResult);
		System.out.println(finalSet);
		System.out.println(finalCounterMap);

	}

}
