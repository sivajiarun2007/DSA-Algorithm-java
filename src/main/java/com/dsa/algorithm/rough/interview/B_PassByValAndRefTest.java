package com.dsa.algorithm.rough.interview;

class TestRef {
	int a;
}

public class B_PassByValAndRefTest {

	public static void main(String[] args) {
		
		int a = 10;
		Integer aObj = 10;
		TestRef refObj = new TestRef();
		refObj.a = 10;
		passByVal(a);
		passByRef(aObj);
		passByObj(refObj);
		
		
		System.out.println(a);
		System.out.println(aObj);
		System.out.println(refObj.a);
	}

	private static void passByObj(TestRef refObj) {
		refObj.a = 11;
		System.out.println(refObj.a);
	}

	private static void passByRef(Integer aObj) {
		aObj = 11;
		System.out.println(aObj);
		
	}

	private static void passByVal(int a) {
		a = 11;
		System.out.println(a);
	}

}
