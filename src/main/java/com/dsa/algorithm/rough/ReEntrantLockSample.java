package com.dsa.algorithm.rough;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

class TestLock implements Runnable {
	private static final ReentrantLock lock = new ReentrantLock(true);
	
	private List<Integer> numList;
	
	TestLock(List<Integer>  numList) {
		this.numList = numList;
	}
	
	public void printNumber(int num) {
		System.out.println("The number before lock is: "+ num );
		lock.lock();
		
		System.out.println("The number after lock is: "+ num );
		
		lock.unlock();
	}

	@Override
	public void run() {
		numList.stream().forEach(x -> this.printNumber(x));
	}
}

public class ReEntrantLockSample {

	public static void main(String[] args) {
		
		TestLock t1 = new TestLock(List.of(1,2,3));
		TestLock t2 = new TestLock(List.of(4,5,6));
		TestLock t3 = new TestLock(List.of(7,8,9));
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		Thread t33 = new Thread(t3);
		
		t11.start();
		t22.start();
		t33.start();
		
	}

}
