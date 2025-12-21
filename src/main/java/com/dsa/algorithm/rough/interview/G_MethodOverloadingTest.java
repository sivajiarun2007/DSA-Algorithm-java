package com.dsa.algorithm.rough.interview;

class Test {
	public void add(double a, int b) {
		System.out.println("Sum is: "+ (a+b));
	}
}

public class G_MethodOverloadingTest {

	public static void main(String[] args) {
		
		F_AbstrctClass.main(args);
		
		Test t = new Test();
		t.add(3L, 'A');
		
		
		String s = new String("Hi").intern();
		
	}

}
