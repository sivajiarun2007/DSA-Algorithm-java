package com.dsa.algorithm.lambda;

public class UniqueElemsInString {

	public static void main(String[] args) {
		
		"Hello".chars().mapToObj(ch -> (char) ch).distinct().forEach(x -> System.out.println(x));
	}

}
