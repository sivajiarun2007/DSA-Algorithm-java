package com.dsa.algorithm.roughwork;

enum Test {
	
	TEST_VARIABLE1("value1"),
	TEST_VARIABLE2("value2"),
	TEST_VARIABLE3("value3");
	

	private String value;
	
	
	
	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	Test(String value) {
		System.out.println("constructor value: " + value);
		this.value= value;
	}
}


public class EnumclassImpl {

	public static void main(String[] args) {
		System.out.println(Test.TEST_VARIABLE1.getValue());
	}

}
