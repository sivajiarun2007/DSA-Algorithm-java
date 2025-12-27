package com.dsa.algorithm.rough.interview;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class J_CyclicBarier {
	
	static CyclicBarrier barrier = new CyclicBarrier(3, ()-> {
		System.out.println("Thanks everyone!");
	});

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("Thread in Execution: " + Thread.currentThread().getName());
			try {
				barrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		Thread th3 = new Thread(runnable);
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
