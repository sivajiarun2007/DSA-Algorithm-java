package com.dsa.algorithm.rough;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread(() -> {
			System.out.println("Executing...");
		});
		
		th.start();
		
		Thread.sleep(10000);
		th.start();
	}

}
