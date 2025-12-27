package com.dsa.algorithm.rough.interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class J_BlockingQue {
	
	private static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
	

	public static void main(String[] args) {
		
		
		
		Runnable producer = ()-> {
			int i = 0;
			while(true) {

				try {
					System.out.println("producing: ");
					queue.put(i++);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		};
		
		Runnable consumer = ()-> {
			while(true) {
				try {
					System.out.println("Consuming: " + queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread prod = new Thread(producer);
		Thread cons = new Thread(consumer);
		
		prod.start();
		cons.start();
	}

}
