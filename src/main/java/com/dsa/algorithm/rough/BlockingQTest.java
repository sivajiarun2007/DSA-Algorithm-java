package com.dsa.algorithm.rough;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQTest {
	
	static BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread producer = new Thread(() -> {
			 try {
				 Thread.sleep(1000);
				queue.put("Hi");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread consumer = new Thread(() -> {
			 try {
				 Thread.sleep(1000);
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		consumer.start();
		producer.start();
		
		
		
	}

}
