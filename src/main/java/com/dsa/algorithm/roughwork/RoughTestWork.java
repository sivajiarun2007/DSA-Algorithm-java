package com.dsa.algorithm.roughwork;

import java.util.function.Function;

class A {
	
	private static int a= 10;
	
	static class B {
		// inner classes can be static
	}
	
	class C {
		
		void print() {
			System.out.println("a:" + a); //inner classes can acces private variables
		}
		
	}
}

public class RoughTestWork {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		
	}

}
