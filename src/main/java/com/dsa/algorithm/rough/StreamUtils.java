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
		
		System.out.println("finalResult: "+ finalResult);
		System.out.println("finalSet: "+finalSet);
		System.out.println("finalCounterMap: "+finalCounterMap);
		
		
		var testJava9Fun = List.of("Arun", "Gandhi","Sve","Sia");
		
		testJava9Fun.stream().takeWhile(x-> x.equalsIgnoreCase("arun")).forEach(System.out::println); //Arun
		testJava9Fun.stream().dropWhile(x-> x.equalsIgnoreCase("arun")).forEach(System.out::println); // From Gandhi
		

	}

}
