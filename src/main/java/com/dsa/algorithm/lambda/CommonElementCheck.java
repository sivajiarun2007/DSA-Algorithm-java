package com.dsa.algorithm.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class CommonElementCheck {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,2,3,4);
		List<Integer> list2 = List.of(1,4);
		
		
		var uniqueSet = list1.stream().collect(Collectors.toSet());
		
		for(int numbe: list2 ) {
			if(!uniqueSet.add(numbe)) {
				System.out.println("coomon num: " + numbe);
			}
			
			
				}
		
	}
	

}
