package com.dsa.algorithm.rough.interview;

public class H_EnumLearning {
	
	public static void main(String[] args) {
		System.out.println(TEST_ENUM_1.RED);
		
		if(TEST_ENUM_1.RED instanceof TEST_ENUM_1) {
			System.out.println("YES");
		}
		
		System.out.println(TEST_ENUM_1.valueOf("RED").getValue());
	}

}


enum TEST_ENUM_1 {
	
	
	
	RED("STOP"),GREEN("GO"),YELLOW("WAIT");
	private String value;
	
	TEST_ENUM_1() {
		System.out.println("Hello");
	}
	TEST_ENUM_1(String s) {
		this.setValue(s);
		System.out.println("Hello");
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}