package com.dsa.algorithm.rough;

import java.util.Arrays;
import java.util.List;

public class FlatMapSample {

	public static void main(String[] args) {
		List<List<String>> nested = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		List<String> flat = nested.stream().flatMap(List::stream).toList();
		System.out.println(flat);

	}

}
