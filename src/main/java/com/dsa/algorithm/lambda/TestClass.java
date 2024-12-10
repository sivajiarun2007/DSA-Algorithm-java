package com.dsa.algorithm.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		// n will be positive integer
		// 1 -> n what are the even numbr --> total count
		
		HashSet<Integer> s = new HashSet<>();
		Integer test = 0;
		
		Stream<Integer> inputNumbers = List.of(1,5,4,2,8,7).stream();
		Stream<Integer> inputNumbers2 = List.of(5,6,8,10,20).stream();
		
		Stream.of(inputNumbers,inputNumbers2).flatMap(x-> x)
				.filter(num -> num%2 ==0).forEach(x-> {
					System.out.println(x);
					s.add(x);
//					test++;
				});
		
		System.out.println(test);
		
		
		
		
//		 AtomicInteger  totalCount = new AtomicInteger(0);
		
//		long result = Stream.concat(inputNumbers,inputNumbers2).filter(num -> num%2 ==0).count();
		
		
		
		
//		System.out.println(result);
	}
	
	
	

}
