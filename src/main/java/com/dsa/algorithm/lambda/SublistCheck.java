package com.dsa.algorithm.lambda;

import java.util.List;
import java.util.stream.IntStream;

public class SublistCheck {

	public static void main(String[] args) {
		
		List<Integer> mainList = List.of(1,2,3,4,5,6);
		List<Integer> subList = List.of(3,4,6);
		
		
		boolean res = IntStream.range(0, subList.size()).anyMatch(i -> mainList.subList(i, i + subList.size()).equals(subList));
		System.out.println(res);
	}

}
