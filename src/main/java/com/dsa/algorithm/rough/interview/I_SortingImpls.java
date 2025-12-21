package com.dsa.algorithm.rough.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortTest implements Comparable<SortTest> {
	public SortTest(String name) {
		this.name = name;
	}
	String name;
	@Override
	public int compareTo(SortTest obj) {
		return obj.name.compareTo(this.name);
	}
	@Override
	public String toString() {
		return "SortTest [name=" + name + "]";
	}
	
	
}

public class I_SortingImpls {

	public static void main(String[] args) {
		SortTest test1 = new SortTest("Sia");
		SortTest test2 = new SortTest("arun");
		SortTest test3 = new SortTest("sve");
		List<SortTest> sortList = new ArrayList<>();
		sortList.addAll(List.of(test1,test2, test3));
		System.out.println(sortList);
		
		Collections.sort(sortList); // this throws error if it doesn't implement comparable
		
		System.out.println(sortList);
		
		Collections.sort(sortList, (a,b)-> {
			return a.name.toLowerCase().compareTo(b.name.toLowerCase());
		});
		
		System.out.println(sortList);
		
		
	}

}
