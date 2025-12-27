package com.dsa.algorithm.rough.interview;

public class J_ThreadLearning {

	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		Thread th = new Thread(()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		
//		th.start();
		System.out.println("Hello");
	}

}
