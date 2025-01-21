package com.dsa.algorithm.rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {

	public static void main(String[] args) {
		Comparator<String> comp= (s1,s2) -> {
			return s2.compareTo(s1);
		};
		
		
		List<String> arr = new ArrayList<>();
		arr.add("B");
		arr.add("A");
		arr.add("C");
		
		List<String> arr1 = new ArrayList<>();
		arr1.add("B");
		arr1.add("A");
		arr1.add("C");
		
		arr.sort(comp);
		Collections.sort(arr1);
		System.out.println(arr);
		System.out.println(arr1);
	}

}
