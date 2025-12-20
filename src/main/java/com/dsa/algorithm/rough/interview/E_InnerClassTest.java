package com.dsa.algorithm.rough.interview;

public class E_InnerClassTest {
	
//	private static String name = "Hello1";
	
	private final String name = "hello";
	
	class InnerClass {
		
		void print() {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		E_InnerClassTest.InnerClass inner = new E_InnerClassTest().new InnerClass();
		inner.print();
	}

}
