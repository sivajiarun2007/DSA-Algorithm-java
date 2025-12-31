package com.dsa.algorithm.lambda;

import java.util.stream.Collectors;

public class StringWithDelimiter {

	public static void main(String[] args) {
		
		System.out.println(Person.PERSON_LIST.stream().map(x-> x.name.toUpperCase()).collect(Collectors.joining(", ")));
	}

}
