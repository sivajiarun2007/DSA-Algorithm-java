package com.dsa.algorithm.rough.interview;

public class D_OperatorChecks {

	public static void main(String[] args) {
		short a=10;
		short b=10;
		
//		short c =a+b; // here short addition is converted to integer so compile error
		
		System.out.println(a+b);
		
		int c = a++;
		int d = ++b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte aByte = (byte)135;
		
		System.out.println(aByte);
	}
	
	

}
