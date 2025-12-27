package com.dsa.algorithm.rough.interview;

public class L_Lambda {

	public static void main(String[] args) {
		MyFuncInterface func = () -> {
			System.out.println("Hi");
		};
		func.testLambda();
	}

}

@FunctionalInterface
interface MyFuncInterface {

	abstract void  testLambda();

//	boolean testMethod(); this throws compile time error
	abstract boolean equals(Object obj); // this doesn't throw error as it is part of Object class

}