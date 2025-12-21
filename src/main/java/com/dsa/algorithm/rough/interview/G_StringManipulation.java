package com.dsa.algorithm.rough.interview;

public class G_StringManipulation {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1 ==s2); // true as they are in SCP
		
		String s3 = new StringBuilder().append("Hello").toString();
		String s4 = new StringBuilder().append("Hello").toString();
		
		StringBuilder s5 = new StringBuilder().append("Hello");
		
		System.out.println(s3 ==s4); // different refs as they are create in heap
		
		System.out.println(s1.equals(s5)); // incomp types
		
		String s6 = s4.intern();
		
		System.out.println(s1 == s6); //comes back to SCP hence will return true
	}

}
