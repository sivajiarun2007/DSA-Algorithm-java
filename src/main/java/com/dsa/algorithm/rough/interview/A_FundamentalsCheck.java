package com.dsa.algorithm.rough.interview;

public class A_FundamentalsCheck {

	public static void main(String[] args) {
		var Var = ""; // var is not a keyworkd
		String String = ""; // we can use predefined class as identifiers
		String Integer = ""; // we can use predefined class as identifiers
		// String int = ""; // apart from lass otehrs wont work
		
		String s = null; // null is a literal
		
		Integer aInt = -1;
		
		// implementation of implicit type conversion
		
		byte a = 1;
		short b = a;
		int c = b;
		long d = c;
		double f = d;
		float e = d;
		
		System.out.println(f);
		
		char charVal = 'A';
		int charValInt = charVal;
		
		System.out.println("Int equivalent "+ charValInt);
		
		final int contant;
		contant = 10;
//		contant = 20; // throws error
	}

}
