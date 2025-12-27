package com.dsa.algorithm.rough.interview;

import java.util.concurrent.CountDownLatch;

public class J_CountDownLatch {
	
	private static CountDownLatch latch = new CountDownLatch(3);

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable runnable = () -> {
			System.out.println("Thread in Execution: " + Thread.currentThread().getName());
			latch.countDown();
		};
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		Thread th3 = new Thread(runnable);
		
		th1.start();
		th2.start();
		th3.start();
		
		latch.await();
		
		System.out.println("Process completed");
	}

}
