package com.dsa.algorithm.lambda;

import java.util.List;

public class MaxValueFromInt {

	public static void main(String[] args) {
		
		var res = List.of(3,2,1,5,6,1,10).stream().mapToInt(x -> x).max();
		System.out.println(res.orElseGet(()-> 0));
	}

}
	